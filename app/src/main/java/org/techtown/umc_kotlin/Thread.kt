package com.example.umc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.umc_kotlin.databinding.ActivityMainBinding

class Thread : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        Thread(){
            for(i in 0 until 1001){
                println(i)
            }
        }.start()
        Thread(){
            for(i in 1000 downTo  0){
                println(i)
            }
        }.start()

    }
}