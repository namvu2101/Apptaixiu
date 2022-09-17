package com.example.apptaixiu

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_tai_xiu.*
import java.util.*
import kotlin.random.Random

class baucuaActivity : AppCompatActivity() {
    lateinit var xx1: AnimationDrawable
    lateinit var xx2: AnimationDrawable
    lateinit var xx3: AnimationDrawable
    var time: Timer = Timer()
    var danhsach:List<Int> = listOf(R.drawable.bau,R.drawable.cua,R.drawable.tom,R.drawable.ca, R.drawable.huou,R.drawable.ga)
    var lichsu: ArrayList<String> = ArrayList()
    var lichsuadap: ArrayAdapter<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baucua)
        lichsuadap = ArrayAdapter(this,android.R.layout.simple_list_item_1,lichsu)
        click()
    }
    private fun click(){

        btnquay.setOnClickListener {
            dice1.setImageResource(R.drawable.hinhdongbaucua)
            dice2.setImageResource(R.drawable.hinhdongbaucua)
            dice3.setImageResource(R.drawable.hinhdongbaucua)
            xx2 = dice2.getDrawable() as AnimationDrawable
            xx2.start()
            xx1 = dice1.getDrawable() as AnimationDrawable
            xx1.start()
            xx3 = dice3.getDrawable() as AnimationDrawable
            xx3.start()
            Handler().postDelayed({
                Randomxx()

            }, 2000)

        }

    }


    public fun Randomxx(){
        var rd = Random.nextInt(danhsach.size)
        var rd1 = Random.nextInt(danhsach.size)
        var rd2 = Random.nextInt(danhsach.size)
        dice1.setImageResource(danhsach[rd])
        dice2.setImageResource(danhsach[rd1])
        dice3.setImageResource(danhsach[rd2])
        lichsuadap?.notifyDataSetChanged();

    }

    override fun onResume() {
        super.onResume()
    }
}