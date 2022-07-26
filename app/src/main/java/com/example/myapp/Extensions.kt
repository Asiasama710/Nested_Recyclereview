package com.example.myapp

import com.example.myapp.data.domin.HomeItem
import com.example.myapp.data.domin.Largemeal
import com.example.myapp.data.domin.enumm.HomeItemType

fun Largemeal.toHomeItem( ):HomeItem<Any> {
    return HomeItem(this,HomeItemType.TYPE_LARGITEM)
}