package com.example.tabbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tabbar.pagerfragments.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_yogamountain.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_yogamountain)

        val adapter = ViewPagerAdapter(supportFragmentManager)

    }
}

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment = when(position){
        0 -> FragmentYogamountain()
        1 -> FragmentYogachair()
        2 -> FragmentYogadog()
        3 -> FragmentYogaplant()
        else -> FragmentYogasnake()
    }

    override fun getCount() = 5

    }

