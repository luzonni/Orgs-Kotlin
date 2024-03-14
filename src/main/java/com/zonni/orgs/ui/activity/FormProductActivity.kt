package com.zonni.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.zonni.orgs.R
import com.zonni.orgs.dao.ProductDAO
import com.zonni.orgs.databinding.ActivityFormProductBinding
import com.zonni.orgs.modelo.Product
import java.math.BigDecimal

class FormProductActivity : AppCompatActivity() {

    private val biding by lazy {
        ActivityFormProductBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(biding.root)
        configSaveButton()
    }

    private fun configSaveButton() {
        val save_buttom = biding.saveButton
        val dao = ProductDAO()
        save_buttom.setOnClickListener {
            val product = buildProduct()
            dao.add(product)
            finish()
        }
    }

    private fun buildProduct(): Product {
        val campo_nome: EditText = biding.nome
        val valor_nome: String = campo_nome.text.toString()
        val campo_description = biding.conteudo
        val valor_description = campo_description.text.toString()
        val campo_price = biding.valor
        var valor_price = campo_price.text.toString()
        if (valor_price.isBlank()) {
            valor_price = BigDecimal.ZERO.toString()
        }
        return Product(valor_nome, valor_description, BigDecimal(valor_price))
    }
}