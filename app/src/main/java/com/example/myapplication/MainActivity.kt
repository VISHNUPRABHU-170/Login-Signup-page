package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
         lateinit var in_button: Button
         lateinit var up_button: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        in_button = findViewById(R.id.login)
        up_button = findViewById(R.id.up)

        in_button.setOnClickListener {
            //it is added
            val intent = Intent(this, signin::class.java)

            startActivity(intent)
        }


        up_button.setOnClickListener {

            val intent = Intent(this, signup::class.java)

            startActivity(intent)
        }

    }
}