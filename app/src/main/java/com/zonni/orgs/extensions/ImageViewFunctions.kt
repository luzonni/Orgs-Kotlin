package com.zonni.orgs.extensions

import android.widget.ImageView
import coil.load
import com.zonni.orgs.R

fun ImageView.loadWithURL(pruductUrl: String? = null) {
    this.load(pruductUrl) {
        fallback(R.drawable.imagem_padrao)
        error(R.drawable.erro)
        placeholder(R.drawable.placeholder)
    }
}