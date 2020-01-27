package com.klh.onlineshop.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.klh.onlineshop.Model.LatestArrivals
import com.klh.onlineshop.R
import kotlinx.android.synthetic.main.latest_arrivals.view.*

class LatestArrivalViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var latestName = itemView.findViewById<TextView>(R.id.txt_latestName)
    var latestBrand = itemView.findViewById<TextView>(R.id.txt_latestBrand)
    var latestPrice = itemView.findViewById<TextView>(R.id.txt_latestPrice)
    var latestImage = itemView.findViewById<ImageView>(R.id.img_latest)

}

class LatestArrivalsAdapter (var latestArrivalList: ArrayList<LatestArrivals>): RecyclerView.Adapter<LatestArrivalViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestArrivalViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.latest_arrivals,parent,false)
        return LatestArrivalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return latestArrivalList.size
    }

    override fun onBindViewHolder(holder: LatestArrivalViewHolder, position: Int) {
        holder.latestName.text = latestArrivalList[position].name
        holder.latestBrand.text = latestArrivalList[position].brand
        holder.latestPrice.text = latestArrivalList[position].price.toString()
        holder.latestImage.setImageResource(latestArrivalList[position].image)
    }

}