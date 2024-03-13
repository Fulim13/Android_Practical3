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
    private val str by lazy { requireArguments().getString("str", "")}
    private val num by lazy { requireArguments().getInt("num", 0)}


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPageABinding.inflate(inflater, container, false)

        binding.btn.setOnClickListener {
            nav.navigateUp()
        }

        // TODO: Output
//        binding.txt.text = "$str=$num"
        binding.txt.text = "%s = %04d".format(str,num)

        return binding.root
    }

    // TODO: Override onStart()

}