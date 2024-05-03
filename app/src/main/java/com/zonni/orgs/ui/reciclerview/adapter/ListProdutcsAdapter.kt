package com.zonni.orgs.ui.reciclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.PopupMenu
import androidx.recyclerview.widget.RecyclerView
import com.zonni.orgs.R
import com.zonni.orgs.databinding.ProductItemBinding
import com.zonni.orgs.extensions.loadWithURL
import com.zonni.orgs.modelo.Product

class ListProdutcsAdapter(
    private val context :Context,
    products: List<Product> = emptyList(),
    public var whenClickOnItem: (product: Product) -> Unit = {},
    public var whenClockOnEdit: (product: Product) -> Unit = {},
    public var whenClickOnDelet: (product: Product) -> Unit = {}
) : RecyclerView.Adapter<ListProdutcsAdapter.ViewHolder>() {

    private val products = products.toMutableList()

    inner class ViewHolder(private val binding: ProductItemBinding) : RecyclerView.ViewHolder(binding.root), PopupMenu.OnMenuItemClickListener {

        private lateinit var product: Product

        init {
            itemView.setOnClickListener {
                if(::product.isInitialized) {
                    whenClickOnItem(product)
                }
            }
            itemView.setOnLongClickListener {
                PopupMenu(context, itemView).apply {
                    menuInflater.inflate(R.menu.menu_details_product,menu)
                    setOnMenuItemClickListener(this@ViewHolder)
                }.show()
                true
            }
        }

        fun binding(product: Product) {
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

        override fun onMenuItemClick(item: MenuItem?): Boolean {
            item?.let {
                when (it.itemId) {
                    R.id.menu_details_product_edit -> {
                        whenClockOnEdit(product)
                    }
                    R.id.menu_details_product_delet -> {
                        whenClickOnDelet(product)
                    }
                }
            }
            return true
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val binding = ProductItemBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.binding(product)
    }

    override fun getItemCount(): Int = products.size

    fun refresh(products: List<Product>) {
        this.products.clear()
        this.products.addAll(products)
        notifyDataSetChanged()
    }


}
