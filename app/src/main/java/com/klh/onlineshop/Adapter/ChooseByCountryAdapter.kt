package com.klh.onlineshop.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.klh.onlineshop.Model.ChooseByCountry
import com.klh.onlineshop.R
import kotlinx.android.synthetic.main.choose_by_country.view.*

class ChooseByCountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var countryImage = itemView.findViewById<ImageView>(R.id.img_countryImage)
    var countryName = itemView.findViewById<TextView>(R.id.txt_countryName)

}

class ChooseByCountryAdapter (val countryList: List<ChooseByCountry>): RecyclerView.Adapter<ChooseByCountryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChooseByCountryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.choose_by_country,parent,false)
        return ChooseByCountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: ChooseByCountryViewHolder, position: Int) {
        holder.countryImage.setImageResource(countryList[position].image)
        holder.countryName.text = countryList[position].name
    }

}