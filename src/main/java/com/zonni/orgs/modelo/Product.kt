package com.zonni.orgs.modelo

import java.lang.invoke.TypeDescriptor
import java.math.BigDecimal
import java.text.NumberFormat
import java.util.Locale

class Product(
    val nome: String,
    val descriptor: String,
    val urlThumb: String? = null,
    val price: BigDecimal
) {

    override fun toString(): String {
        return "[ $nome - $descriptor - $price ]"
    }

    fun formattedPrice(): String {
        val formater: NumberFormat = NumberFormat.getCurrencyInstance(Locale("pt", "br"))
        val valorEmMoeda: String = formater.format(price)
        return valorEmMoeda
    }

}
