package com.example.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.demo.databinding.ActivityMainBinding
import com.example.demo.databinding.HeaderBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val nav by lazy { supportFragmentManager.findFragmentById(R.id.host)!!.findNavController() }

    // TODO: AppBarConfiguration
    private lateinit var abc: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // TODO: AppBarConfiguration
        abc = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.page1Fragment,
                R.id.page2Fragment,
                R.id.page3Fragment,
            ),
            binding.root
        )

        // TODO: Setup action bar, drawer and bottom
        setupActionBarWithNavController(nav,abc)
        binding.nv.setupWithNavController(nav)
        binding.bv.setupWithNavController(nav)


        // TODO: Custom action
        // Snackbar.make(binding.root, "Hello World", Snackbar.LENGTH_SHORT).show()
        binding.nv.menu.findItem(R.id.hello).setOnMenuItemClickListener {
            Snackbar.make(binding.root, "Hello World", Snackbar.LENGTH_SHORT).show()
            binding.root.close()
            true
        }

        // TODO: Access to drawer's header
        val h = HeaderBinding.bind(binding.nv.getHeaderView(0,))
        h.photo.setImageResource(R.drawable.jieun)
        h.name.text = "LEE JIEUN"
        h.email.text = "jieun@gmail.com"
    }

    override fun onSupportNavigateUp(): Boolean {
        // TODO: AppBarConfiguration
        return nav.navigateUp(abc)
    }

}