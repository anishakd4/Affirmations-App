package com.anishdubey.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.anishdubey.affirmations.databinding.ListItemBinding
import com.anishdubey.affirmations.model.Affirmation

class ItemAdapter(
    private val context: Context,
    private val dataSet: List<Affirmation>
    ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding: ListItemBinding = ListItemBinding.inflate(
            LayoutInflater.from(context),
            parent,
            false
        )
        return ItemViewHolder(context,binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    class ItemViewHolder(
        private val context: Context,
        private val binding: ListItemBinding
        ): RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Affirmation) {
            binding.itemTitle.text = context.getString(item.stringResId)
            binding.imageView.setImageResource(item.imageResId)
        }
    }

}