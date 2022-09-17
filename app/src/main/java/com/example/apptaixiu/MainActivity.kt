package com.example.apptaixiu

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Time
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      txttaixiu.setOnClickListener {
          var intent: Intent = Intent(this,TaiXiuActivity::class.java)
          startActivity(intent)
      }
        baucua.setOnClickListener {
            var intent: Intent = Intent(this,baucuaActivity::class.java)
            startActivity(intent)
        }
        xocdia.setOnClickListener {
            var intent: Intent = Intent(this,XocDiaActivity::class.java)
            startActivity(intent)
        }
    }


}