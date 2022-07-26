package com.example.myapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapp.data.domin.HomeItem
import com.example.myapp.data.domin.Largemeal
import com.example.myapp.data.domin.Smallmeal
import com.example.myapp.data.domin.enumm.HomeItemType
import com.example.myapp.databinding.LargemealItemBinding
import com.example.myapp.databinding.SmallmealItemListBinding

class HomeAdpter(private  val items:List<HomeItem<Any>>): RecyclerView.Adapter<HomeAdpter.BaseHomeViewHolder>() {


    override fun getItemCount()=items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHomeViewHolder {
       return when(viewType){
           View_TYPE_SMALL_ITEM ->{
               val view = LayoutInflater.from(parent.context).inflate(R.layout.smallmeal_item_list,parent,false)
               SmallMealViewHolder(view)
           }
           View_TYPE_LARGE_ITEM ->{
               val view = LayoutInflater.from(parent.context).inflate(R.layout.largemeal_item,parent,false)
               LargeMealViewHolder(view)
              }
           else -> throw Exception("UNKNOWN VIEW TYPE")
       }
    }

    override fun onBindViewHolder(holder: BaseHomeViewHolder, position: Int) {
        when(holder){
            is SmallMealViewHolder -> bindSmallItem(holder,position)
            is LargeMealViewHolder -> bindLargItem(holder,position)
        }
    }

    private fun bindLargItem(holder: LargeMealViewHolder, position: Int) {
     val currentitem=items[position].item as Largemeal
        holder.binding.apply {
            labelName.text=currentitem.name
            labelItemContent.text=currentitem.content
            Glide.with(this.root.context).load(currentitem.ImageUrl).into(largeMealImage)
        }
    }

    private fun bindSmallItem(holder: SmallMealViewHolder, position: Int) {
       val smallMeal=items[position].item as List<Smallmeal>
        val adapter=SmallItemAdapter(smallMeal)
        holder.binding.apply {
            recyclerSmallItem.adapter=adapter
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(items[position].type){
            HomeItemType.TYPE_SMALLITEM -> View_TYPE_SMALL_ITEM
            HomeItemType.TYPE_LARGITEM -> View_TYPE_LARGE_ITEM
        }
    }
    abstract class BaseHomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
     class SmallMealViewHolder(itemView: View) : BaseHomeViewHolder(itemView) {
         val binding = SmallmealItemListBinding.bind(itemView)
    }
    class LargeMealViewHolder(itemView: View) : BaseHomeViewHolder(itemView) {
         val binding = LargemealItemBinding.bind(itemView)
    }

    companion object{
        private  const val View_TYPE_SMALL_ITEM=1
        private  const val View_TYPE_LARGE_ITEM=2
    }
}