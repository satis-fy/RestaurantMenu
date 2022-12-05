package com.example.restaurantmenu.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import com.example.restaurantmenu.R
import com.example.restaurantmenu.databinding.ActivityMainBinding
import com.example.restaurantmenu.presentation.restaurant_menus_list.RestaurantMenusListFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        supportFragmentManager.beginTransaction().apply {
            add(R.id.frameLayout, RestaurantMenusListFragment())
            commit()
        }
    }
}