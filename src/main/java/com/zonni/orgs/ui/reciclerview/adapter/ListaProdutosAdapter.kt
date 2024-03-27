package com.zonni.orgs.ui.reciclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zonni.orgs.databinding.ProductItemBinding
import com.zonni.orgs.extensions.loadWithURL
import com.zonni.orgs.modelo.Product
import java.math.BigDecimal
import java.text.NumberFormat
import java.util.Locale

class ListaProdutosAdapter(
    private val context :Context,
    products: List<Product>,
    var whenClickOnItem: (product: Product) -> Unit = {}
) : RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {

    private val products = products.toMutableList()

    inner class ViewHolder(private val binding: ProductItemBinding) : RecyclerView.ViewHolder(binding.root){

        private lateinit var product: Product
        init {
            itemView.setOnClickListener {
                if(::product.isInitialized) {
                    whenClickOnItem(product)
                }
            }
        }
        fun vincula(product: Product) {
            val title = binding.productItemTitulo
            title.text = product.nome
            binding.productItemConteudo.text = product.descriptor
            binding.productItemValor.text = product.formattedPrice()
            val visibilidade = if(product.urlThumb != null) {
                View.VISIBLE
            }else {
                View.GONE
            }
            binding.productItemImage.visibility = visibilidade
            binding.productItemImage.loadWithURL(product.urlThumb)
            this.product = product
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val binding = ProductItemBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.vincula(product)
    }

    override fun getItemCount(): Int = products.size

    fun refresh(products: List<Product>) {
        this.products.clear()
        this.products.addAll(products)
        notifyDataSetChanged()
    }


}
