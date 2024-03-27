package com.zonni.orgs.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.zonni.orgs.databinding.ProductSpecificationBinding
import com.zonni.orgs.extensions.loadWithURL

class ProductSpecificationActivity() : AppCompatActivity() {

    private val binding by lazy {
        ProductSpecificationBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val urlThumb = intent.getStringExtra("urlThumb")
        val title = intent.getStringExtra("title")
        val content = intent.getStringExtra("content")
        val price = intent.getStringExtra("price")

        binding.productSpecificationImage.loadWithURL(urlThumb)
        binding.productSpecificationTitle.text = title
        binding.productSpecificationPrice.text = price
        binding.productSpecificationContent.text = content


    }


}