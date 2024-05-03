package com.zonni.orgs.ui.activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.datastore.preferences.core.edit
import androidx.lifecycle.lifecycleScope
import com.zonni.orgs.database.AppDatabse
import com.zonni.orgs.extensions.goTo
import com.zonni.orgs.modelo.User
import com.zonni.orgs.preferences.dataStore
import com.zonni.orgs.preferences.userLoggedPreferences
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

abstract class UserBaseActivity : AppCompatActivity() {

    private val userDAO by lazy {
        AppDatabse.instance(this).userDAO()
    }
    private val _user: MutableStateFlow<User?> = MutableStateFlow(null)
    protected val user: StateFlow<User?> = _user

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycleScope.launch {
            checkUserLogged()
        }
    }

    protected fun users() = userDAO.searchAll()

    private suspend fun checkUserLogged() {
        dataStore.data.collect { preferences ->
            preferences[userLoggedPreferences]?.let { userId ->
                searchUser(userId)
            } ?: goToLogin()
        }
    }

    private suspend fun searchUser(userId: String) : User? {
        return userDAO.searchWithId(userId).firstOrNull().also {
            _user.value = it
        }
    }

    protected suspend fun deslogar() {
        dataStore.edit { preferences ->
            preferences.remove(userLoggedPreferences)
        }
    }


    private fun goToLogin() {
        goTo(LoginActivity::class.java) {
            //elimina todas as activitys anteriores
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        }
        finish()
    }

}