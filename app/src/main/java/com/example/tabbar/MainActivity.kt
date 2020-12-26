package com.example.tabbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.example.tabbar.fragments.FoodFragment
import com.example.tabbar.fragments.HomeFragment
import com.example.tabbar.fragments.OptionFragment
import com.example.tabbar.fragments.SportsFragment
import com.example.tabbar.fragments.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_sports.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()




    }

    private fun setUpTabs(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment())
        adapter.addFragment(SportsFragment())
        adapter.addFragment(FoodFragment())
        adapter.addFragment(OptionFragment())
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_sports_handball_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_fastfood_24)
        tabs.getTabAt(3)!!.setIcon(R.drawable.ic_baseline_event_note_24)

    }
}