package org.techtown.umc_kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.techtown.umc_kotlin.databinding.FragmentMainBinding
import org.techtown.umc_kotlin.databinding.FragmentNewBinding

class NewFragment: Fragment() {
    private lateinit var viewBinding: FragmentNewBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentNewBinding.inflate(layoutInflater)
        return viewBinding.root
    }
}