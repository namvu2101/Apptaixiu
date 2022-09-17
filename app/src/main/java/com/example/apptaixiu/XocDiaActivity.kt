package com.example.apptaixiu

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_tai_xiu.*
import kotlinx.android.synthetic.main.activity_xoc_dia.*
import java.util.*
import kotlin.random.Random

abstract class XocDiaActivity : AppCompatActivity(){
    lateinit var v1:AnimationDrawable
    lateinit var v2:AnimationDrawable
    lateinit var v3:AnimationDrawable
    lateinit var v4:AnimationDrawable
    lateinit var mobat:Animation
    lateinit var dongbat:Animation
    var time: Timer = Timer()
    var danhsach:List<Int> = listOf(R.drawable.trang,R.drawable.den)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xoc_dia)
       // Animation()
        click()
    }
    private fun click(){

        btnlac.setOnClickListener {
            vien1.setImageResource(R.drawable.xapngua)
            vien2.setImageResource(R.drawable.xapngua)
            vien3.setImageResource(R.drawable.xapngua)
            vien4.setImageResource(R.drawable.xapngua)
            v1 = vien1.getDrawable() as AnimationDrawable
            v1.start()
            v2 = vien2.getDrawable() as AnimationDrawable
            v2.start()
            v3 = vien3.getDrawable() as AnimationDrawable
            v3.start()
            v4 = vien4.getDrawable() as AnimationDrawable
            v4.start()
            Handler().postDelayed({
                Randomxx()
            }, 2000)

        }
//        btnMo.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(view: View?) {
//                if (view != null) {
//                    view.startAnimation(mobat)
//                }
//            }
//
//        })

    }

    private fun Animation(){
        mobat = AnimationUtils.loadAnimation(this@XocDiaActivity,R.anim.mobat_animation)
    }
    public fun Randomxx(){
        var rd = Random.nextInt(danhsach.size)
        var rd1 = Random.nextInt(danhsach.size)
        var rd2 = Random.nextInt(danhsach.size)
        var rd3 = Random.nextInt(danhsach.size)
        vien1.setImageResource(danhsach[rd])
        vien2.setImageResource(danhsach[rd1])
        vien3.setImageResource(danhsach[rd2])
        vien4.setImageResource(danhsach[rd2])
    }

    override fun onResume() {
        super.onResume()
    }
    fun onClick(v: View?) {
       if(v ==btnMo)
           caibat.startAnimation(mobat)
    }
}
