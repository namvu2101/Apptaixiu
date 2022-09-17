package com.example.apptaixiu

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.view.size
import kotlinx.android.synthetic.main.activity_history.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tai_xiu.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

 open class TaiXiuActivity : AppCompatActivity() {
    lateinit var xx1: AnimationDrawable
    lateinit var xx2: AnimationDrawable
    lateinit var xx3: AnimationDrawable

    var time: Timer = Timer()
    var danhsach:List<Int> = listOf(R.drawable.d1ic,R.drawable.d2ic,R.drawable.d3ic,R.drawable.d4ic, R.drawable.d5ic,R.drawable.d6ic)
     var rd:Int=0
     var rd1:Int=0
     var rd2 = 0
    var lichsu: ArrayList<String> = ArrayList()
     var lichsutx: ArrayList<lichsuTX> = ArrayList()
    var lichsuadap: ArrayAdapter<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tai_xiu)
        lichsuadap = ArrayAdapter(this,android.R.layout.simple_list_item_1,lichsu)
        lichsuquay.adapter = lichsuadap
        click()

    }
    private fun click(){
        txtlichsu.setOnClickListener {
            var intent:Intent = Intent(this,HistoryActivity::class.java)
            startActivity(intent)
        }
        Collections.sort(lichsu)
        btnquay.setOnClickListener {
            dice1.setImageResource(R.drawable.hinhdong)
            dice2.setImageResource(R.drawable.hinhdong)
            dice3.setImageResource(R.drawable.hinhdong)
            kq.text = "Kết quả: "
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
         rd = Random.nextInt(danhsach.size)
         rd1 = Random.nextInt(danhsach.size)
         rd2 = Random.nextInt(danhsach.size)
        dice1.setImageResource(danhsach[rd])
        dice2.setImageResource(danhsach[rd1])
        dice3.setImageResource(danhsach[rd2])
        var tong = rd+rd1+rd2+3

        lichsuadap?.notifyDataSetChanged();
        if(tong>10)
            kq.text = "Kết quả: Tài " + tong
        else kq.text = "Kết quả: Xỉu " + tong
//        lichsutx.add(lichsuTX(""+kq.toString(),danhsach[rd],danhsach[rd1],danhsach[rd2]))
        Toast.makeText(this,danhsach[rd1],Toast.LENGTH_LONG).show()
        lichsu.add(""+kq.text.toString() + "  "+" ["+ (rd+1) +"] "+" ["+(rd1+1)+ "] "+" ["+(rd2+1)+"]")

    }

     override fun onStart() {
         super.onStart()
     }

}