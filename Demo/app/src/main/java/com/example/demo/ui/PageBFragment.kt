package com.example.demo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.demo.databinding.FragmentPageBBinding

// TODO: Convert to BottomSheetDialogFragment
class PageBFragment : Fragment() {

    private lateinit var binding: FragmentPageBBinding
    private val nav by lazy { findNavController() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPageBBinding.inflate(inflater, container, false)

        binding.btn.setOnClickListener {
            nav.navigateUp()
        }

        return binding.root
    }

}