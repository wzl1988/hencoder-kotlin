package com.example.core

import android.app.Application
import android.content.Context

class BaseApplication :Application(){
    companion object{
        @JvmStatic
        @get:JvmName("currentApplication")
        lateinit var currentApplication:Context  //默认生成set get
        private set
    }

    override fun onCreate() {
        super.onCreate()
        currentApplication =this
    }
}