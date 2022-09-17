package com.example.apptaixiu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class lichsuAdapter(var context:Context,var Arraylichsu:ArrayList<lichsuTX>):BaseAdapter() {
    class ViewHolder(row :View){
     var itemlist:TextView
     var xucxac1:ImageView
     var xucxac2:ImageView
     var xucxac3:ImageView

        init {
            itemlist = row.findViewById(R.id.ketqua) as TextView
            xucxac1 = row.findViewById(R.id.xx1) as ImageView
            xucxac2 = row.findViewById(R.id.xx2) as ImageView
            xucxac3 = row.findViewById(R.id.xx3) as ImageView
     }
    }

    override fun getCount(): Int {//tra ve so luong phan tu
        return Arraylichsu.size
    }

    override fun getItem(position: Int): Any {//thuoc tinh trong doi tuong
        return Arraylichsu.get(position)
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       var view:View?
       var viewHolder : ViewHolder
       if (convertView==null){
           var layoutInflater:LayoutInflater = LayoutInflater.from(context)
           view = layoutInflater.inflate(R.layout.item_history,null)
           viewHolder = ViewHolder(view)
           view.tag =viewHolder
       }else{
           view = convertView
           viewHolder = convertView.tag as ViewHolder
       }
        var lichsutx:lichsuTX = getItem(position) as lichsuTX
        viewHolder.itemlist.text = lichsutx.ketqua
        viewHolder.xucxac1.setImageResource(lichsutx.xx1)
        viewHolder.xucxac1.setImageResource(lichsutx.xx2)
        viewHolder.xucxac1.setImageResource(lichsutx.xx3)
        return view as View
    }
}