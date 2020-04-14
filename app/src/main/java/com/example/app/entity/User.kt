package com.example.app.entity

import android.os.Parcel
import android.os.Parcelable

data class User  constructor(var username :String?,var password:String?,var code:String?) {
//    var username :String?=null
//    var password:String?=null
//    var code:String?=null

//     set(value) {
//        field =value
//    }
//     get(){
//        return field
//    }


       //    constructor(username :String,password:String,code:String){
//        this.password =password
//        this.username=username
//        this.code =code
//    }
       constructor():this(null,null,null){}


//    fun main(){
//        println("cs")
//    }
//
//    fun test(name:String):String {
//        return name+"a"
//    }



}