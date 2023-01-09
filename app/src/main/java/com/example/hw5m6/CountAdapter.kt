package com.example.hw5m6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.hw5m6.UI.MainFragment
import com.example.hw5m6.UI.ResultFragment
import com.example.hw5m6.UI.StoryFragment
import com.example.hw5m6.databinding.FragmentResultBinding
import com.example.hw5m6.databinding.ItemCountBinding

class CountAdapter(fm :FragmentManager): FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position) {

            0 -> {
                return MainFragment()
            }

            1 -> {
                return ResultFragment()
            }

            2 -> {
                return StoryFragment()
            }

            else -> {
                return MainFragment()
            }
        }
    }
}