package com.rival.foodrescue.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rival.foodrescue.databinding.ItemRowRecomendationRescueBinding
import com.rival.foodrescue.ui.home.RescueData

class RecomendRescueFood(private val dataRescue: List<RescueData>) :
    RecyclerView.Adapter<RecomendRescueFood.ViewHolder>() {
    class ViewHolder(var binding: ItemRowRecomendationRescueBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemRowRecomendationRescueBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = 3

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tes = dataRescue[position]

        holder.binding.apply {
            tvNameFood.text = tes.nameFood
            tvLocationFood.text = tes.placeFood
            tvKilometer.text = tes.kilometer

          Glide.with(holder.itemView.context)
              .load(tes.image)
              .into(ivRescue)
        }

        Log.d("datarescue", tes.image.toString())


    }
}