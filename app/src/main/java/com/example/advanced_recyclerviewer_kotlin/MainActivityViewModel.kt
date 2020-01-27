package com.example.advanced_recyclerviewer_kotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private val colorItemRepository = ColorItemRepository()

    val colorItems =
        MutableLiveData<List<ColorItem>>().apply { value = colorItemRepository.getColorItems() }
}