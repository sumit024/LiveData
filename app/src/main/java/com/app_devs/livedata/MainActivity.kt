package com.app_devs.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mainActivityViewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainActivityViewModel=ViewModelProvider(this).get(MainActivityViewModel::class.java)

        mainActivityViewModel.myLiveData.observe(this, Observer {
            tv.text=it
        })
        btn.setOnClickListener {
            mainActivityViewModel.updateLiveData()
        }


    }
}