package com.example.tabbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tabbar.fragments.FoodFragment
import com.example.tabbar.fragments.HomeFragment
import com.example.tabbar.fragments.OptionFragment
import com.example.tabbar.fragments.SportsFragment
import com.example.tabbar.fragments.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

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