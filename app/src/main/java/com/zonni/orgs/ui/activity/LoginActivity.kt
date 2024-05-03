package com.zonni.orgs.ui.activity

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.lifecycle.lifecycleScope
import com.zonni.orgs.database.AppDatabse
import com.zonni.orgs.databinding.ActivityLoginBinding
import com.zonni.orgs.extensions.goTo
import com.zonni.orgs.extensions.toast
import com.zonni.orgs.preferences.dataStore
import com.zonni.orgs.preferences.userLoggedPreferences
import com.zonni.orgs.ui.activity.ui.theme.OrgsTheme
import kotlinx.coroutines.launch

class LoginActivity : AppCompatActivity() {

    private val userDAO by lazy {
        AppDatabse.instance(this).userDAO()
    }
    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        configEnterButton()
        configRegisterButton()
    }

    private fun configEnterButton() {
        binding.activityLoginBotaoEntrar.setOnClickListener {
            val username = binding.activityLoginUsuario.text.toString()
            val password = binding.activityLoginSenha.text.toString()
            authenticate(username, password)
        }
    }

    private fun authenticate(username: String, password: String) {
        lifecycleScope.launch {
            userDAO.authenticate(username, password)?.let { user ->
                dataStore.edit { preferences ->
                    preferences[userLoggedPreferences] = user.id;
                }
                goTo(ListProductsActivity::class.java)
                finish()
            } ?: toast("Falha na autenticação")
        }
    }

    private fun configRegisterButton() {
        binding.activityLoginBotaoCadastrar.setOnClickListener {
            goTo(RegisterUserActivity::class.java)
        }
    }

}