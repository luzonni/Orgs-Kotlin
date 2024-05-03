package com.zonni.orgs.ui.activity

import android.R
import android.os.Bundle
import android.util.Log
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.ArrayAdapter
import android.widget.EditText
import androidx.lifecycle.lifecycleScope
import com.zonni.orgs.database.AppDatabse
import com.zonni.orgs.database.dao.ProductDAO
import com.zonni.orgs.databinding.ActivityFormProductBinding
import com.zonni.orgs.extensions.loadWithURL
import com.zonni.orgs.modelo.Product
import com.zonni.orgs.modelo.User
import com.zonni.orgs.ui.dialog.FormImageDialog
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import java.math.BigDecimal

class FormProductActivity() : UserBaseActivity() {

    private val binding by lazy {
        ActivityFormProductBinding.inflate(layoutInflater)
    }
    private val productDao: ProductDAO by lazy {
        AppDatabse.instance(this).productDAO()
    }
    private var urlThumb: String? = null
    private var productID: Long = 0L;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        title = "Cadastrar produto"
        configSaveButton()
        binding.activityFormProductThumb.setOnClickListener {
            FormImageDialog(this).show(urlThumb) {
                this.urlThumb = it
                binding.activityFormProductThumb.loadWithURL(this.urlThumb)
            }
        }
        productID = intent.getLongExtra(PRODUCT_ID_KEY, 0L)
    }

    override fun onResume() {
        super.onResume()
        tryGetProduct()
    }

    private fun tryGetProduct() {
        lifecycleScope.launch {
            productDao.searchWithId(productID)?.let {
                title = "Alterar Produto"
                val fieldUserId = binding.activityFormProductUserId
                fieldUserId.visibility = if(it.noUser()) {
                    configFieldUser()
                    VISIBLE
                }else{
                    GONE
                }
                fillFields(it)
            }
        }
    }

    private fun configFieldUser() {
        lifecycleScope.launch {
            users().map { users ->
                users.map{it.id}
            }.collect{ users ->
                configAutoCompletTextView(users)
            }
        }
    }

    private fun configAutoCompletTextView(users: List<String>) {
        val fieldUserId = binding.activityFormProductUserId
        val adapter = ArrayAdapter(this@FormProductActivity, R.layout.simple_dropdown_item_1line, users)
        fieldUserId.setAdapter(adapter)
        fieldUserId.setOnFocusChangeListener{ _,focado ->
            if(!focado) {
                validUser(users)
            }
        }
    }

    private fun validUser(users: List<String>): Boolean {
        val fiedUserId = binding.activityFormProductUserId
        val userID = fiedUserId.text.toString()
        if(!users.contains(userID)) {
            fiedUserId.error = "User Not Found!"
            return false
        }
        return true
    }

    private fun fillFields(loadedProduct: Product) {
        this.urlThumb = loadedProduct.urlThumb
        binding.activityFormProductThumb.loadWithURL(this.urlThumb)
        binding.formProductInputNome.setText(loadedProduct.nome)
        binding.formProductInputConteudo.setText(loadedProduct.descriptor)
        binding.formProductInputValor.setText(loadedProduct.price.toString())
    }

    private fun configSaveButton() {
        val saveButtom = binding.activityFormProductSaveButton
        saveButtom.setOnClickListener {
            lifecycleScope.launch {
                trySaveProduct()
            }
        }
    }

    private suspend fun trySaveProduct() {
        user.value?.let {
            try {
                val userId = setUserId(it)
                val product = buildProduct(userId)
                productDao.insert(product)
                finish()
            }catch (e: RuntimeException) {
                Log.e("FormularioProduto", "configuraBotaoSalvar: ", e)
            }
        }
    }

    private suspend fun setUserId(user: User): String {
        return productDao.searchWithId(productID)?.let {
            if (it.userId.isNullOrBlank()) {
                val usuarios = users()
                    .map { usuariosEncontrados ->
                        usuariosEncontrados.map { it.id }
                    }.first()
                if (validUser(usuarios)) {
                    val campoUsuarioId =
                        binding.activityFormProductUserId
                    return campoUsuarioId.text.toString()
                } else {
                    throw RuntimeException("Tentou salvar produto com usuário inexistente")
                }
            }
            null
        } ?: user.id
    }

    private fun buildProduct(userId: String): Product {
        val campoNome: EditText = binding.formProductInputNome
        val valorNome: String = campoNome.text.toString()
        val campoDescription = binding.formProductInputConteudo
        val valorDescription = campoDescription.text.toString()
        val campoPrice = binding.formProductInputValor
        var valorPrice = campoPrice.text.toString()
        if (valorPrice.isBlank()) {
            valorPrice = BigDecimal.ZERO.toString()
        }

        return Product(
            id = productID,
            nome = valorNome,
            descriptor = valorDescription,
            urlThumb = urlThumb,
            price = BigDecimal(valorPrice),
            userId = userId
        )
    }
}