package com.example.demo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.demo.R
import com.example.demo.databinding.FragmentPage1Binding

class Page1Fragment : Fragment() {

    private lateinit var binding: FragmentPage1Binding
    private val nav by lazy { findNavController() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPage1Binding.inflate(inflater, container, false)

        binding.btn.setOnClickListener {
            nav.navigate(R.id.page2Fragment)
        }

        return binding.root
    }

}