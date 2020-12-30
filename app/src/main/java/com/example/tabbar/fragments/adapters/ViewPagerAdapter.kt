package com.example.tabbar.fragments.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tabbar.fragments.FoodFragment
import com.example.tabbar.fragments.HomeFragment
import com.example.tabbar.fragments.OptionFragment
import com.example.tabbar.fragments.SportsFragment
import java.util.ArrayList

class ViewPagerAdapter(supportFragmentManager: FragmentManager):FragmentPagerAdapter(supportFragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val mFragmentList = ArrayList<Fragment>()


    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }




    fun addFragment(fragment: Fragment){
        mFragmentList.add(fragment)

    }
}