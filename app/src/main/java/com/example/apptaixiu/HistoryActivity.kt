package com.example.apptaixiu

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_history.*
import kotlinx.android.synthetic.main.activity_tai_xiu.*
import kotlinx.android.synthetic.main.item_history.*
import java.util.ArrayList

class HistoryActivity : TaiXiuActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        lichsutx.add(lichsuTX(""+kq.text.toString(),danhsach[rd],danhsach[rd1],danhsach[rd2]))
        listlichsu.adapter = lichsuAdapter(this@HistoryActivity,lichsutx)

    }
}