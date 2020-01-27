package com.klh.onlineshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.klh.onlineshop.Adapter.ChooseByCountryAdapter
import com.klh.onlineshop.Adapter.LatestArrivalsAdapter
import com.klh.onlineshop.Adapter.PopularProductsAdapter
import com.klh.onlineshop.Model.ChooseByCountry
import com.klh.onlineshop.Model.LatestArrivals
import com.klh.onlineshop.Model.PopularProducts

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        latestArrivals()
        chooseByCountry()
        popularProducts()

    }

    fun latestArrivals() {
        var recyclerLatest: RecyclerView = findViewById(R.id.recycler_latest)

        var latestArrivalsList = ArrayList<LatestArrivals>()
        latestArrivalsList.add(LatestArrivals("Monogram Canvas", "Louis Vuitton", 1999.99, R.drawable.lv_bag))
        latestArrivalsList.add(LatestArrivals("T-Shirt", "Supreme", 99.99, R.drawable.t_shirt))
        latestArrivalsList.add(LatestArrivals("Perfume for Men", "Crocodile", 299.99, R.drawable.perfume))
        latestArrivalsList.add(LatestArrivals("Sea Master", "Omega", 3000.00, R.drawable.watch))


        var latestArrivalsAdapter = LatestArrivalsAdapter(latestArrivalsList)
        recyclerLatest.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerLatest.adapter = latestArrivalsAdapter
    }

    fun chooseByCountry() {
        var recyclerCountry: RecyclerView = findViewById(R.id.recycler_chooseByCountry)
        var chooseByCountryList = ArrayList<ChooseByCountry>()
        chooseByCountryList.add(ChooseByCountry(R.drawable.japan,"Japan"))
        chooseByCountryList.add(ChooseByCountry(R.drawable.korea,"Korea"))
        chooseByCountryList.add(ChooseByCountry(R.drawable.china,"China"))
        chooseByCountryList.add(ChooseByCountry(R.drawable.international,"International"))


        var chooseByCountryAdapter = ChooseByCountryAdapter(chooseByCountryList)
        recyclerCountry.layoutManager = GridLayoutManager(this,2)
        recyclerCountry.adapter = chooseByCountryAdapter
    }

    fun popularProducts() {
        var recyclerPopular: RecyclerView = findViewById(R.id.recycler_popular)
        var popularProductsList = ArrayList<PopularProducts>()
        popularProductsList.add(PopularProducts("Iphone 11 Pro Max","IPhone", 1249,R.drawable.iphone_11_pro_max))
        popularProductsList.add(PopularProducts("OnePlus 7 Pro", "OnePlus", 700, R.drawable.oneplus7_pro))
        popularProductsList.add(PopularProducts("Mi 9 Pro","Xiao Mi",320,R.drawable.mi9_pro))


        var popularProductsAdapter = PopularProductsAdapter(popularProductsList)
        recyclerPopular.layoutManager = LinearLayoutManager(this)
        recyclerPopular.adapter = popularProductsAdapter
    }
}
