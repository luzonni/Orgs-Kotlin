package com.zonni.orgs.ui.activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.zonni.orgs.R
import com.zonni.orgs.database.AppDatabse
import com.zonni.orgs.database.dao.ProductDAO
import com.zonni.orgs.databinding.ProductSpecificationBinding
import com.zonni.orgs.extensions.loadWithURL
import com.zonni.orgs.modelo.Product
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.math.BigDecimal

class ProductSpecificationActivity() : AppCompatActivity() {

    private val scope = CoroutineScope(Main)
    private var productID: Long = 0L
    private var product: Product? = null

    private val binding by lazy {
        ProductSpecificationBinding.inflate(layoutInflater)
    }

    private val productDAO: ProductDAO by lazy {
        AppDatabse.instance(this).productDAO()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_details_product, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_details_product_delet -> {
                scope.launch {
                    product?.let {
                        productDAO.remove(it)
                    }
                    finish()
                }
            }
            R.id.menu_details_product_edit -> {
                Intent(this, FormProductActivity::class.java).apply {
                    putExtra(PRODUCT_ID_KEY, productID)
                    startActivity(this)
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        tryLoad()
    }

    override fun onResume() {
        super.onResume()
        searchProduct()
    }

    private fun searchProduct() {
        scope.launch {
            product = productDAO.searchWithId(productID)
            product?.let {
                fillFields(it)
            } ?: finish()
        }
    }

    private fun tryLoad() {
        productID = intent.getLongExtra(PRODUCT_ID_KEY, 0L)
    }

    private fun fillFields(produtoCarregado: Product) {
        with(binding) {
            productSpecificationImage.loadWithURL(produtoCarregado.urlThumb)
            productSpecificationTitle.text = produtoCarregado.nome
            productSpecificationContent.text = produtoCarregado.descriptor
            productSpecificationPrice.text = produtoCarregado.formattedPrice()
        }
    }


}