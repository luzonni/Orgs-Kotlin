package com.zonni.orgs.ui.activity

import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.zonni.orgs.databinding.ActivityUserPerfilBinding
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch

class UserPerfilActivity : UserBaseActivity() {

    private val binding by lazy {
        ActivityUserPerfilBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        lifecycleScope.launch {
            user.filterNotNull().collect {
                binding.activityUserPerfilName.text = it.name
                binding.activityUserPerfilUsername.text = it.id
            }
        }
        binding.activityUserPerfilButtonLogout.setOnClickListener {
            lifecycleScope.launch {
                deslogar()
            }
        }
    }

}