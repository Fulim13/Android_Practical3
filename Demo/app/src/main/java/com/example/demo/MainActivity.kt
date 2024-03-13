package com.example.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val nav by lazy { supportFragmentManager.findFragmentById(R.id.host)!!.findNavController() }

    // TODO: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // TODO: AppBarConfiguration

        // TODO: Setup action bar, drawer and bottom
        setupActionBarWithNavController(nav)

        // TODO: Custom action
        // Snackbar.make(binding.root, "Hello World", Snackbar.LENGTH_SHORT).show()

        // TODO: Access to drawer's header

    }

    override fun onSupportNavigateUp(): Boolean {
        // TODO: AppBarConfiguration
        return nav.navigateUp()
    }

}