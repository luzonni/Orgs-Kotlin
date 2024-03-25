package com.zonni.orgs.modelo

import java.lang.invoke.TypeDescriptor
import java.math.BigDecimal

class Product(
    val nome: String,
    val descriptor: String,
    val urlThumb: String? = null,
    val price: BigDecimal
) {

    override fun toString(): String {
        return "[ $nome - $descriptor - $price ]"
    }

}
