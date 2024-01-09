package com.tamdev.waether.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tamdev.waether.adapters.WeatherModel

class MainViewModel: ViewModel() {
    val liveDataCurret = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}