package com.rival.foodrescue.ui.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rival.foodrescue.R
import com.rival.foodrescue.databinding.ItemRowPamerFotoBinding
import com.rival.foodrescue.databinding.ItemRowRecomendationRescueBinding
import com.rival.foodrescue.ui.home.MyData
import com.rival.foodrescue.ui.home.RescueData

class CombineAdapter(private val horizontalData: List<MyData>,
                     private val verticalData: List<RescueData>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_HORIZONTAL = 1
    private val TYPE_VERTICAL = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TYPE_HORIZONTAL -> {
                val binding = ItemRowPamerFotoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                HorizontalViewHolder(binding)
            }
            TYPE_VERTICAL -> {
                val binding = ItemRowRecomendationRescueBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                VerticalViewHolder(binding)
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun getItemCount(): Int {
        return horizontalData.size + verticalData.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewType = getItemViewType(position)
        when (viewType) {
            TYPE_HORIZONTAL -> {
                val horizontalPosition = getHorizontalPosition(position)
                (holder as? HorizontalViewHolder)?.bind(horizontalData[horizontalPosition])
            }
            TYPE_VERTICAL -> {
                val verticalPosition = getVerticalPosition(position)
                (holder as? VerticalViewHolder)?.bind(verticalData[verticalPosition])
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (isHorizontal(position)) {
            TYPE_HORIZONTAL
        } else {
            TYPE_VERTICAL
        }
    }

    private fun isHorizontal(position: Int): Boolean {
        return position < horizontalData.size
    }

    private fun getHorizontalPosition(combinedPosition: Int): Int {
        return combinedPosition
    }

    private fun getVerticalPosition(combinedPosition: Int): Int {
        return combinedPosition - horizontalData.size
    }

    inner class HorizontalViewHolder(private val binding: ItemRowPamerFotoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: MyData) {
            binding.apply {
                tvUsername.text = data.username
                tvLocation.text = data.place
                tvStatus.text = data.status
                tvHashtag.text = data.hashtag.joinToString(" ")
                Glide.with(root.context)
                    .load(data.image)
                    .into(ivPost)

                Glide.with(root.context)
                    .load(data.profile)
                    .into(ivProfile)
            }
        }
    }

    inner class VerticalViewHolder(private val binding: ItemRowRecomendationRescueBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: RescueData) {
            binding.apply {
                Glide.with(root.context)
                    .load(data.image)
                    .into(ivRescue)
            }
        }
    }
}