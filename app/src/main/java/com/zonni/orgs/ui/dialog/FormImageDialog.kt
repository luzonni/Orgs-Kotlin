package com.zonni.orgs.ui.dialog

import android.content.Context
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import com.zonni.orgs.databinding.FormImageBinding
import com.zonni.orgs.extensions.loadWithURL

class FormImageDialog(val context: Context) {

    fun show(defaultURL: String? = null, whenImageLoaded: (url: String) -> Unit) {
        FormImageBinding.inflate(LayoutInflater.from(context)).apply {
            defaultURL?.let {
                formImageImageView.loadWithURL(it)
                formImageUrl.setText(it)
            }

            formImageButtonCarregar.setOnClickListener {
                var urlThumb = formImageUrl.text.toString()
                formImageImageView.loadWithURL(urlThumb)
            }
            AlertDialog.Builder(context)
                .setView(root)
                .setPositiveButton("Confirmar") { _, _ ->
                    var urlThumb = formImageUrl.text.toString()
                    whenImageLoaded(urlThumb)
                }
                .setNegativeButton("Cancelar") { _, _ -> }
                .show()
        }

    }

}