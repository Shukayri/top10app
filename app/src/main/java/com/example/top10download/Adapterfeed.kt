package com.example.top10download


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.feed_item.view.*

class Adapterfeed (private val items:ArrayList<FeedEntry>): RecyclerView.Adapter<Adapterfeed.MyViewHolder>() {
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val tvFeed : TextView = itemView.feed_tv


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.feed_item,
            parent,
            false
        )
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holderMy: MyViewHolder, position: Int) {
        val title =items[position].name
        holderMy.tvFeed.text = title

    }

    override fun getItemCount(): Int {
        return items.size
    }


}