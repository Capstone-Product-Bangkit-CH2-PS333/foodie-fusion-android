package com.rival.foodrescue.ui.rescue

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rival.foodrescue.R

class RescueFragment : Fragment() {

    companion object {
        fun newInstance() = RescueFragment()
    }

    private lateinit var viewModel: RescueViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_rescue, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RescueViewModel::class.java)
        // TODO: Use the ViewModel
    }

}