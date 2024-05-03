package com.zonni.orgs.modelo

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.math.BigDecimal
import java.text.NumberFormat
import java.util.Locale
@Entity
@Parcelize
data class Product(
    @PrimaryKey(true) val id: Long = 0L,
    val nome: String,
    val descriptor: String,
    val urlThumb: String? = null,
    val price: BigDecimal,
    val userId: String? = null
) : Parcelable {

    override fun toString(): String {
        return "[ $nome - $descriptor - $price ]"
    }

    fun formattedPrice(): String {
        val formater: NumberFormat = NumberFormat.getCurrencyInstance(Locale("pt", "br"))
        val valorEmMoeda: String = formater.format(price)
        return valorEmMoeda
    }

    fun noUser() = userId.isNullOrBlank() && id > 0L

}
