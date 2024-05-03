package com.zonni.orgs.database.converter

import androidx.room.TypeConverter
import java.math.BigDecimal

class Converters {

    @TypeConverter
    fun deDouble(value: Double?) : BigDecimal {
        return value?.let {
            BigDecimal(it.toString())
        } ?: BigDecimal.ZERO
    }

    @TypeConverter
    fun bigDecimalToDouble(value: BigDecimal?) : Double? {
        return value?.let { it.toDouble() }
    }

}