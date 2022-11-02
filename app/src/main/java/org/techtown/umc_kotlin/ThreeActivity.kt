package org.techtown.umc_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.umc_kotlin.databinding.ActivityThreeBinding

class ThreeActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityThreeBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val extras = intent.extras
        val data = extras!!["text"] as String

        viewBinding.textview3.text = data

        supportFragmentManager
            .beginTransaction()
            .replace(viewBinding.frameFragment.id, MainFragment())
            .commitAllowingStateLoss()

        viewBinding.button2.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(viewBinding.frameFragment.id, MainFragment())
                .commitAllowingStateLoss()
        }

        viewBinding.button3.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(viewBinding.frameFragment.id, NewFragment())
                .commitAllowingStateLoss()
        }

    }
}