package org.techtown.umc_kotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.techtown.umc_kotlin.databinding.ActivityMainBinding
import org.techtown.umc_kotlin.databinding.ActivityNewBinding

class NewActivity : AppCompatActivity() {
    private  lateinit var viewBinding: ActivityNewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityNewBinding.inflate(layoutInflater);
        setContentView(viewBinding.root)

        val extras = intent.extras
        val data = extras!!["text"] as String

        viewBinding.textview2.text = data


        viewBinding.btn2.setOnClickListener{
            val intent = Intent(this, ThreeActivity::class.java)

            intent.putExtra("text","third")
            startActivity(intent)

        }
    }



}