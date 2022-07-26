package com.example.myapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapp.data.domin.Smallmeal
import com.example.myapp.databinding.SmallmealItemBinding

class SmallItemAdapter(private val items: List<Smallmeal>): RecyclerView.Adapter<SmallItemAdapter.SmallItemViewHolder>()  {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SmallItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.smallmeal_item,parent,false)
        return SmallItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: SmallItemViewHolder, position: Int) {
        val currentitem=items[position]
        holder.binding.apply {
            labelName.text=currentitem.name
            Glide.with(this.root.context).load(currentitem.ImageUrl).into(imageItem)
        }
    }

    override fun getItemCount()=items.size


    class SmallItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = SmallmealItemBinding.bind(itemView)
    }

}