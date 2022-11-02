package org.techtown.umc_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.umc_kotlin.databinding.ActivityMainBinding
import org.techtown.umc_kotlin.databinding.ActivityThreeBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.btn1.setOnClickListener{
            val intent = Intent(this, NewActivity::class.java)

            intent.putExtra("text","second")
            startActivity(intent)
        }

    }
}