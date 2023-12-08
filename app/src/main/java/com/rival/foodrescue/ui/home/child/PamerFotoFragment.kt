package com.rival.foodrescue.ui.home.child

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.rival.foodrescue.databinding.FragmentPamerFotoBinding
import com.rival.foodrescue.ui.home.adapter.CombineAdapter
import com.rival.foodrescue.ui.home.adapter.PamerFotoAdapter
import com.rival.foodrescue.ui.home.adapter.RecomendRescueFood
import com.rival.foodrescue.ui.home.randomDataList
import com.rival.foodrescue.ui.home.randomRescueDataList


class PamerFotoFragment : Fragment() {

    private lateinit var binding: FragmentPamerFotoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPamerFotoBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mAdapter = PamerFotoAdapter(randomDataList)
        val mAdapterRescue = RecomendRescueFood(randomRescueDataList)
//        val combinedAdapter = CombineAdapter(randomDataList, randomRescueDataList)

        binding.rvPamerFoto.apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        binding.rvPamerFotoVertical.apply {
            adapter = mAdapterRescue
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }

//        binding.rvCombined.apply {
//            adapter = combinedAdapter
//            layoutManager = LinearLayoutManager(requireContext())
//        }

    }

}