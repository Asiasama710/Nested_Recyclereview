package com.example.myapp.data.domin

import com.example.myapp.data.domin.enumm.HomeItemType

data class HomeItem<T>(
    val item:T,
    val type:HomeItemType
)
