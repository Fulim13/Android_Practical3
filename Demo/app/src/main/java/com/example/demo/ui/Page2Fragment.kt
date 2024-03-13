package com.example.demo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.demo.R
import com.example.demo.databinding.FragmentPage2Binding

class Page2Fragment : Fragment() {

    private lateinit var binding: FragmentPage2Binding
    private val nav by lazy { findNavController() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPage2Binding.inflate(inflater, container, false)

        binding.btn.setOnClickListener {
            nav.popBackStack(R.id.homeFragment, false)
            nav.navigate(R.id.page1Fragment)
        }

        return binding.root
    }

}