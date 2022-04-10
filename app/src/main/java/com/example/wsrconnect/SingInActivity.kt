package com.example.wsrconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SingInActivity : AppCompatActivity() {
    lateinit var singUp_btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in)

        singUp_btn = findViewById(R.id.singUpBtn)

        singUp_btn.setOnClickListener {
            val intent = Intent(this, SingUpActivity::class.java )
            startActivity(intent)
        }
    }



}