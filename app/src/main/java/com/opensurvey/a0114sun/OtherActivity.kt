package com.opensurvey.a0114sun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        returnBtn.setOnClickListener{

//            val returnIntent = Intent(this,MainActivity::class.java)
//            startActivity(returnIntent)

            finish()

        }

    }
}