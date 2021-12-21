package com.neppplus.deliveryorder_20211220.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.deliveryorder_20211220.fragment.MyProfileFragment
import com.neppplus.deliveryorder_20211220.fragment.PizzaStoreListFragment

class MainViewPagerAdapter(fm:FragmentManager): FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0-> "피자 가게"
            else -> "나의 프로필"
        }
    }

    override fun getCount(): Int {
        return 2

    }

    override fun getItem(position: Int): Fragment {

       return when (position){

            0-> PizzaStoreListFragment()
            else-> MyProfileFragment()
        }


    }
}