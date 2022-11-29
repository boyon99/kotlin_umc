package org.techtown.umc_kotlin

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class VPAdapter(FragmentActivity : FragmentActivity) : FragmentStateAdapter(FragmentActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> MainFragment()
            1 -> ThreeFragment()
            2 -> NewFragment()
            else -> MainFragment()
        }

    }

}