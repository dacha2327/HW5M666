package com.example.hw5m6.UI

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hw5m6.MainViewModel
import com.example.hw5m6.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        onIncrement()
        onDecrement()
    }

    private fun onIncrement() {
        binding.btnPlus.setOnClickListener {
            viewModel.onIncrement()
        }
        Log.e("ololo","Increment")
    }

    private fun onDecrement() {
        binding.btnMinus.setOnClickListener {
            viewModel.onDecrement()
        }
        Log.e("ololo","decrement")
    }





}