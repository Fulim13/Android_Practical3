package com.example.demo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.demo.R
import com.example.demo.databinding.FragmentPage3Binding

class Page3Fragment : Fragment() {

    private lateinit var binding: FragmentPage3Binding
    private val nav by lazy { findNavController() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPage3Binding.inflate(inflater, container, false)

        binding.btnA.setOnClickListener {
            // TODO: Pass arguments
            nav.navigate(R.id.pageAFragment)
        }

        binding.btnB.setOnClickListener {
            nav.navigate(R.id.pageBFragment)
        }

        return binding.root
    }

}