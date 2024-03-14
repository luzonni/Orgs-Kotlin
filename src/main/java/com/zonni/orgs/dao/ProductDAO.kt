package com.zonni.orgs.dao

import com.zonni.orgs.modelo.Product

class ProductDAO {

    fun add(product: Product) {
        list_product.add(product)
    }

    fun searchAll(): List<Product> {
        return list_product.toList()
    }

    companion object {
        private val list_product = mutableListOf<Product>(
            Product("Frutas", "Laranja, Maçã, Banana, Uva", "24.99".toBigDecimal())
        )
    }

}