package com.app_devs.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
    private val myLiveDataObject=MutableLiveData<String>("Hello from LiveData")
    val myLiveData:LiveData<String>
    get()=myLiveDataObject
    fun updateLiveData()
    {
        myLiveDataObject.postValue("Hello from LiveData again!")
    }


}