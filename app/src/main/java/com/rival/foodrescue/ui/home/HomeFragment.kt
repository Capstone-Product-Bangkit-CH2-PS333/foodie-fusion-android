package com.rival.foodrescue.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.rival.foodrescue.databinding.FragmentHomeBinding
import com.rival.foodrescue.adapter.SectionPagerAdapter

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupViewPager()
    }

    private fun setupViewPager() {
        binding.vpHome.adapter = SectionPagerAdapter(requireActivity())
        val tabList = arrayOf(
            "#PamerFoto",
            "#PamerHangout"
        )
        TabLayoutMediator(binding.tabs, binding.vpHome) { tab, position ->
            tab.text = tabList[position]
        }.attach()
    }


}


