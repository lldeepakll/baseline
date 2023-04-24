package com.code.findapark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.code.findapark.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = checkNotNull(_binding)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

//    private fun initFragment() {
//        val navController = (supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment).navController
//        navController.addOnDestinationChangedListener(this)
//        navController.setGraph(
//            R.navigation.nav_graph, bundleOf(SCRIP_DATA to scripNameWithPriceData)
//        )
//    }
}