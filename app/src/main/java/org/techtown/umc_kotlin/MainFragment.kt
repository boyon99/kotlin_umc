package org.techtown.umc_kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.techtown.umc_kotlin.databinding.FragmentMainBinding

class MainFragment: Fragment() {
    private lateinit var viewBinding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentMainBinding.inflate(layoutInflater)
        return viewBinding.root
    }
}