package com.example.wsrconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SingUpActivity : AppCompatActivity() {
    lateinit var close_btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)

        close_btn = findViewById(R.id.closeBtn)
        close_btn.setOnClickListener { val intent = Intent(this, SingInActivity::class.java )
            startActivity(intent) }
    }


}