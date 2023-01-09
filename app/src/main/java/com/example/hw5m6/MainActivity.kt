package com.example.hw5m6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.hw5m6.databinding.ActivityMainBinding
import com.example.hw5m6.databinding.FragmentMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initVP()
    }

    private fun initVP() {
        binding.viewPager.adapter = CountAdapter(supportFragmentManager)
    }


}