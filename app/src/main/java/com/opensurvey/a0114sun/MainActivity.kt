package com.opensurvey.a0114sun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToOtherBtn.setOnClickListener{

            val myIntent = Intent(this,OtherActivity::class.java)
            startActivity(myIntent)

        }

        sandMessageBtn.setOnClickListener{

            val inputMessage = messageEdt.text.toString()
            val sandIntent = Intent(this,MessageActivity::class.java)

            sandIntent.putExtra("message",inputMessage )

            startActivity(sandIntent)

        }

    }
}