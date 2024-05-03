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
import androidx.lifecycle.lifecycleScope
import com.zonni.orgs.database.AppDatabse
import com.zonni.orgs.databinding.ActivityRegisterUserBinding
import com.zonni.orgs.extensions.toast
import com.zonni.orgs.modelo.User
import com.zonni.orgs.ui.activity.ui.theme.OrgsTheme
import kotlinx.coroutines.launch

class RegisterUserActivity : AppCompatActivity() {

    private val userDAO by lazy {
        AppDatabse.instance(this).userDAO()
    }
    private val binding by lazy {
        ActivityRegisterUserBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        configRegisterButton()
    }

    private fun configRegisterButton() {
        binding.activityFormularioCadastroBotaoCadastrar.setOnClickListener {
            register(criaUsuario())
        }
    }

    private fun register(newUser: User) {
        lifecycleScope.launch {
            try {
                userDAO.insert(newUser)
                finish()
            }catch (e : Exception) {
                Log.e("FormRegisterUser", "configRegisterButton", e)
                toast("Falha ao cadastrar usuario")
            }
        }
    }

    private fun criaUsuario(): User {
        val usuario = binding.activityFormularioCadastroUsuario.text.toString()
        val nome = binding.activityFormularioCadastroNome.text.toString()
        val senha = binding.activityFormularioCadastroSenha.text.toString()
        return User(usuario, nome, senha)
    }
}