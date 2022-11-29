package org.techtown.umc_kotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import org.techtown.umc_kotlin.databinding.ActivityNaviBinding
import org.techtown.umc_kotlin.databinding.ActivityNewBinding
import org.techtown.umc_kotlin.databinding.ActivityTabBinding

class TabView : AppCompatActivity() {
    private val viewBinding: ActivityTabBinding by lazy{
        ActivityTabBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        val VPAdapter = VPAdapter(this)
        viewBinding.vpMain.adapter = VPAdapter

        val tabTitleArray = arrayOf(
            "Home",
            "Image",
            "Setting"
        )

        TabLayoutMediator(viewBinding.tabMain, viewBinding.vpMain){tab, position ->
            tab.text = tabTitleArray[position]
        }.attach()


    }

}