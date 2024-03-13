package com.example.demo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.demo.databinding.FragmentPageABinding

// TODO: Convert to DialogFragment
class PageAFragment : Fragment() {

    private lateinit var binding: FragmentPageABinding
    private val nav by lazy { findNavController() }

    // TODO: Get arguments

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPageABinding.inflate(inflater, container, false)

        binding.btn.setOnClickListener {
            nav.navigateUp()
        }

        // TODO: Output
        binding.txt.text = "XXX = 999"

        return binding.root
    }

    // TODO: Override onStart()

}