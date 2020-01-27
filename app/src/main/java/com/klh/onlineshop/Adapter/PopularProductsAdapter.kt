package com.klh.onlineshop.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.klh.onlineshop.Model.PopularProducts
import com.klh.onlineshop.R
import kotlinx.android.synthetic.main.popular_products.view.*

class PopularProductViewHolder (itemView: View) : RecyclerView.ViewHolder (itemView) {
    var popularName = itemView.findViewById<TextView>(R.id.txt_popularName)
    var popularType = itemView.findViewById<TextView>(R.id.txt_popularType)
    var popularPrice = itemView.findViewById<TextView>(R.id.txt_popularPrice)
    var popularImage = itemView.findViewById<ImageView>(R.id.img_popularImage)
}

class PopularProductsAdapter(var popularProductsList: ArrayList<PopularProducts>): RecyclerView.Adapter<PopularProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularProductViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.popular_products,parent,false)
        return PopularProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return popularProductsList.size
    }

    override fun onBindViewHolder(holder: PopularProductViewHolder, position: Int) {
        holder.popularName.text = popularProductsList[position].name
        holder.popularType.text = popularProductsList[position].type
        holder.popularPrice.text = popularProductsList[position].price.toString()
        holder.popularImage.setImageResource(popularProductsList[position].image)

    }

}