package com.zonni.orgs.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.zonni.orgs.dao.ProductDAO
import com.zonni.orgs.databinding.ListProductsMainBinding
import com.zonni.orgs.ui.reciclerview.adapter.ListaProdutosAdapter

class ListProductsActivity : AppCompatActivity() {

    private val product_dao = ProductDAO()
    private val adapter = ListaProdutosAdapter(this, product_dao.searchAll())
    private val biding  by lazy {
        ListProductsMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(biding.root)
        configRecyclerView()
        configFab()
    }

    override fun onResume() {
        super.onResume()
        adapter.refresh(product_dao.searchAll())
    }

    private fun configFab() {
        val add_button = biding.addButton
        add_button.setOnClickListener {
            goToFormProduct()
        }
    }

    private fun goToFormProduct() {
        val intent = Intent(this, FormProductActivity::class.java)
        startActivity(intent)
    }

    private fun configRecyclerView() {
        val recyclerView = biding.listaProdutos
        recyclerView.adapter = adapter
        adapter.whenClickOnItem = {
            val intent = Intent(this, ProductSpecificationActivity::class.java).apply {
                putExtra("urlThumb", it.urlThumb)
                putExtra("title", it.nome)
                putExtra("content", it.descriptor)
                putExtra("price", it.formattedPrice())
            }
            startActivity(intent)
        }
    }

}