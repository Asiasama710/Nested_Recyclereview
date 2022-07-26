package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp.data.DataSource
import com.example.myapp.data.domin.HomeItem
import com.example.myapp.data.domin.enumm.HomeItemType
import com.example.myapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
      setup()
    }
lateinit var adapter: HomeAdpter
     fun setup() {
        val itemslist:MutableList<HomeItem<Any>> = mutableListOf()
        itemslist.add(HomeItem(DataSource.getSmallMeal(),HomeItemType.TYPE_SMALLITEM))
        itemslist.addAll(
            DataSource.getLargeMeal().map { it.toHomeItem() }
        )
        adapter = HomeAdpter(itemslist)
        binding.recyclerHome.adapter = adapter
    }


}