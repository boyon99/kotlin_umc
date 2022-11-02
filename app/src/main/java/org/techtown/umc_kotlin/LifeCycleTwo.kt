package org.techtown.umc_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.techtown.umc_kotlin.databinding.ActivityLifecycletwoBinding

class LifeCycleTwo :AppCompatActivity(){

    private lateinit var binding: ActivityLifecycletwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLifecycletwoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.txtSecond.text = intent.getStringExtra("data")
    }
}