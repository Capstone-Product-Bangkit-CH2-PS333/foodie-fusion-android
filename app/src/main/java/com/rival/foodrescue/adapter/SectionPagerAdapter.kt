package com.rival.foodrescue.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.rival.foodrescue.ui.home.child.PamerFotoFragment
import com.rival.foodrescue.ui.home.child.PamerHangoutFragment

class SectionPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 2
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PamerFotoFragment()
            1 -> PamerHangoutFragment()
            else -> PamerFotoFragment()
        }
    }

}