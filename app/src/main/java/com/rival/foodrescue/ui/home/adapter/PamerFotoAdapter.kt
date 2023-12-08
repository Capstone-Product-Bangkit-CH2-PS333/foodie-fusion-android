package com.rival.foodrescue.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rival.foodrescue.databinding.ItemRowPamerFotoBinding
import com.rival.foodrescue.ui.home.MyData

class PamerFotoAdapter(private val dataList: List<MyData>) :
    RecyclerView.Adapter<PamerFotoAdapter.ViewHolder>() {
    class ViewHolder(var binding: ItemRowPamerFotoBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemRowPamerFotoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]

        holder.binding.apply {
            tvUsername.text = data.username
            tvLocation.text = data.place
            tvStatus.text = data.status
            tvHashtag.text = data.hashtag.joinToString(" ")
            Glide.with(holder.itemView.context)
                .load(data.image)
                .into(ivPost)

            Glide.with(holder.itemView.context)
                .load(data.profile)
                .into(ivProfile)

        }


    }
}