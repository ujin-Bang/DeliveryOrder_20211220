package com.neppplus.deliveryorder_20211220.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.deliveryorder_20211220.fragments.MyProfileFragment
import com.neppplus.deliveryorder_20211220.fragments.PizzaStoreLIstFragment

class MainViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2

    }

    override fun getItem(position: Int): Fragment {

       return when(position){
            0 -> PizzaStoreLIstFragment()
           else -> MyProfileFragment()
        }

    }
}