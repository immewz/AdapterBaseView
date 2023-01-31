package com.padcmyanmar.mewz.adapterbaseview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.mewz.adapterbaseview.R
import com.padcmyanmar.mewz.adapterbaseview.viewHolder.ImageViewHolder

class ViewPagerWithCustomViewAdapter : RecyclerView.Adapter<ImageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.view_item_image,parent,false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }
}