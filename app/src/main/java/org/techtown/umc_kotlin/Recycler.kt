package org.techtown.umc_kotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.techtown.umc_kotlin.databinding.ActivityMainBinding
import org.techtown.umc_kotlin.databinding.ActivityRecyclerBinding

data class BusinessCard(val name:String, val contents:String)

class Recycler : AppCompatActivity() {

    var businessCardArrayList = ArrayList<BusinessCard>()

    private lateinit var customAdapter: CustomAdapter
    private lateinit var Binding: ActivityRecyclerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(Binding.root)


        for(x in 0..5){
            businessCardArrayList.add(BusinessCard("이름1", "내용1"))
            businessCardArrayList.add(BusinessCard("이름2", "내용2"))
        }


        customAdapter = CustomAdapter(this, businessCardArrayList)
        Binding.listviewMain.adapter = customAdapter
    }

}