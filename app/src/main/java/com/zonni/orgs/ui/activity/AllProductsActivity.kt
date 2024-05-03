package com.zonni.orgs.ui.activity

import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.ConcatAdapter
import com.zonni.orgs.database.AppDatabse
import com.zonni.orgs.databinding.ActivityAllProductsBinding
import com.zonni.orgs.extensions.goTo
import com.zonni.orgs.modelo.Product
import com.zonni.orgs.ui.reciclerview.adapter.HeaderAdapter
import com.zonni.orgs.ui.reciclerview.adapter.ListProdutcsAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AllProductsActivity : UserBaseActivity() {

    private val binding by lazy {
        ActivityAllProductsBinding.inflate(layoutInflater)
    }

    private val productDAO by lazy {
        AppDatabse.instance(this).productDAO()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val recyclerView = binding.activityAllProductsRecyclerview
        lifecycleScope.launch {
            productDAO.searchAll().map { products ->
                products.sortedBy {
                    it.userId
                }.groupBy {
                    it.userId
                }.map { userProduct ->
                    builHeaderProductAdapter(userProduct)
                }.flatten()
            }.collect{ adapter ->
                recyclerView.adapter = ConcatAdapter(adapter)
            }
        }


    }

    private fun builHeaderProductAdapter(userProcuts: Map.Entry<String?, List<Product>>) = listOf(
        HeaderAdapter(this, listOf(userProcuts.key)),
        ListProdutcsAdapter(this, userProcuts.value,
            whenClickOnItem = { clicked ->
                goTo(ProductSpecificationActivity::class.java) {
                    putExtra(PRODUCT_ID_KEY, clicked.id)
                }
            }, whenClockOnEdit = { clicked ->
                goTo(FormProductActivity::class.java) {
                    putExtra(PRODUCT_ID_KEY, clicked.id)
                }
            }, whenClickOnDelet = { clicked ->
                lifecycleScope.launch {
                    withContext(Dispatchers.IO) {
                        productDAO.removeWithId(clicked.id)
                    }
                }
            }
        )
    )

}