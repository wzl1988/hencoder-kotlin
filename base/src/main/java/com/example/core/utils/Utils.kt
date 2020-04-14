@file:JvmName("KotlinUtils")
package com.example.core.utils

import android.content.res.Resources
import android.util.TypedValue
import android.widget.Toast
import com.example.core.BaseApplication

//private static final DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
//
//public static float dp2px(float dp) {
//    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics);
//}
//
//public static void toast(String string) {
//    toast(string, Toast.LENGTH_SHORT);
//}
//
//public static void toast(String string, int duration) {
//    Toast.makeText(BaseApplication.currentApplication(), string, duration).show();
//}

private val displayMetrics = Resources.getSystem().displayMetrics

fun Float.dp2px():Float{
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this, displayMetrics);
}


object Utils{
     @JvmOverloads //java调用单参数
     fun toast(string:String?, duration:Int =Toast.LENGTH_SHORT) {
        Toast.makeText(BaseApplication.currentApplication, string, duration).show();
    }
}


