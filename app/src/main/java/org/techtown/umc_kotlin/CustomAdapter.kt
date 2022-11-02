package org.techtown.umc_kotlin

import android.content.Context
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import org.techtown.umc_kotlin.databinding.ListviewItemBinding

class CustomAdapter(context: Context, private val businessCardArrayList:ArrayList<BusinessCard>) : BaseAdapter() {

    val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    lateinit var binding: ListviewItemBinding


    override fun getCount(): Int = businessCardArrayList.size

    override fun getItem(p0: Int): Any = businessCardArrayList[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    override fun getView(position : Int, p1: View?, p2: ViewGroup?): View {

        binding = ListviewItemBinding.inflate(inflater, p2, false)
        binding.nameListviewItem.text = businessCardArrayList[position].name
        binding.contnentsListviewItem.text = businessCardArrayList[position].contents

        return binding.root
    }



}