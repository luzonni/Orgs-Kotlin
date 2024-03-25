package com.zonni.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import coil.load
import com.zonni.orgs.R
import com.zonni.orgs.dao.ProductDAO
import com.zonni.orgs.databinding.ActivityFormProductBinding
import com.zonni.orgs.databinding.FormImageBinding
import com.zonni.orgs.extensions.loadWithURL
import com.zonni.orgs.modelo.Product
import com.zonni.orgs.ui.dialog.FormImageDialog
import java.math.BigDecimal

class FormProductActivity() : AppCompatActivity() {

    private val binding by lazy {
        ActivityFormProductBinding.inflate(layoutInflater)
    }

    private var urlThumb: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        title = "Cadastrar produto"
        configSaveButton()
        binding.activityFormProductThumb.setOnClickListener{
            FormImageDialog(this).show(urlThumb){
                this.urlThumb = it
                binding.activityFormProductThumb.loadWithURL(this.urlThumb)
            }
        }
    }

    private fun configSaveButton() {
        val save_buttom = binding.activityFormProductSaveButton
        val dao = ProductDAO()
        save_buttom.setOnClickListener {
            val product = buildProduct()
            dao.add(product)
            finish()
        }
    }

    private fun buildProduct(): Product {
        val campo_nome: EditText = binding.formProductInputNome
        val valor_nome: String = campo_nome.text.toString()
        val campo_description = binding.formProductInputConteudo
        val valor_description = campo_description.text.toString()
        val campo_price = binding.formProductInputValor
        var valor_price = campo_price.text.toString()
        if (valor_price.isBlank()) {
            valor_price = BigDecimal.ZERO.toString()
        }
        return Product(nome = valor_nome, descriptor = valor_description, urlThumb = urlThumb, price = BigDecimal(valor_price))
    }
}