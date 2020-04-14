package com.example.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.app.entity.User
import com.example.app.widget.CodeView
import com.example.core.utils.CacheUtils
import com.example.lesson.LessonActivity

fun Activity.setContentView(id:Int){

}

class MainActivity :AppCompatActivity(), View.OnClickListener {
    private val usernameKey:String ="username"
    private val passwordKey:String ="password"

    private lateinit var et_username:EditText
    private lateinit var et_password:EditText
    private lateinit var et_code:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_username =findViewById<EditText>(R.id.et_username)
        et_password = findViewById(R.id.et_password)
        et_code =findViewById(R.id.et_code)

        et_username.setText(CacheUtils.get(usernameKey))
        et_password.setText(CacheUtils.get(passwordKey))

        val btn_login:Button = findViewById<Button>(R.id.btn_login)
        btn_login.setOnClickListener(this)
        findViewById<CodeView>(R.id.code_view).setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        if(v is Button){
            login()
        }else if(v is CodeView){
            v.updateCode()
        }
    }

       private fun login(){
           val username: String = et_username.text.toString()
           val psw: String = et_password.text.toString()
           val code: String = et_code.text.toString()

           val user: User = User(username, psw, code)
           fun verify(): Boolean {
               if (user.username?.length ?: 0 < 4) {
                   return false
               }
               if (user.password?.length ?: 0 < 4) {
                   return false
               }
               return true
           }

           if (verify()) {
               CacheUtils.save(usernameKey, username)
               CacheUtils.save(passwordKey, psw)
               startActivity(Intent(this, LessonActivity::class.java))
           }

    }







}