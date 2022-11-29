package org.techtown.umc_kotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import org.techtown.umc_kotlin.databinding.ActivityMainBinding
import org.techtown.umc_kotlin.databinding.ActivityNaviBinding

class NavigationView : AppCompatActivity() {
    private val viewBinding: ActivityNaviBinding by lazy{
        ActivityNaviBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(viewBinding.containerFragment.id, MainFragment())
            .commitAllowingStateLoss()

        viewBinding.navBottom.run{
            setOnItemSelectedListener {
                when (it.itemId){
                R.id.menu_home -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(viewBinding.containerFragment.id, MainFragment())
                        .commitAllowingStateLoss()
                }
                    R.id.menu_setting -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.containerFragment.id, NewFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_image -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.containerFragment.id, ThreeFragment())
                            .commitAllowingStateLoss()
                    }
            }
                true
            }
            // 처음 시작시 ID 값 전달
            selectedItemId = R.id.menu_home
        }



    }
}


