package com.zonni.orgs.ui.reciclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zonni.orgs.databinding.HeaderProductsBinding

class HeaderAdapter(
    private val context: Context,
    users: List<String?> = emptyList()
) : RecyclerView.Adapter<HeaderAdapter.ViewHolder>() {

    private val USERS: List<String?> = users.toMutableList()

    inner class ViewHolder(private val binding : HeaderProductsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun binding(userName: String?) {
            binding.headerTitle.text = userName
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(HeaderProductsBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun getItemCount() = USERS.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val u = if(USERS[position].isNullOrEmpty()) {
            "No User"
        }else {
            USERS[position]
        }
        holder.binding(u)
    }


}