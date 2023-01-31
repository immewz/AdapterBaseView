package com.padcmyanmar.mewz.adapterbaseview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.mewz.adapterbaseview.Delegate.NewItemActionDelegate
import com.padcmyanmar.mewz.adapterbaseview.R
import com.padcmyanmar.mewz.adapterbaseview.viewHolder.BaseNewViewHolder
import com.padcmyanmar.mewz.adapterbaseview.viewHolder.ElevenViewHolder
import com.padcmyanmar.mewz.adapterbaseview.viewHolder.MRTVNewViewHolder

class NewsAdapter(private val delegate: NewItemActionDelegate) : RecyclerView.Adapter<BaseNewViewHolder>() {

    val VIEW_TYPE_ELEVEN = 1
    val VIEW_TYPE_MRTV = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseNewViewHolder {
        when(viewType){
            VIEW_TYPE_ELEVEN -> {
                val itemView = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_eleven_new,parent,false)
                return ElevenViewHolder(itemView, delegate)
            }
            VIEW_TYPE_MRTV -> {
                val itemView = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_mrtv,parent,false)
                return MRTVNewViewHolder(itemView, delegate)
            }
            else -> {
                val itemView = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_mrtv,parent,false)
                return MRTVNewViewHolder(itemView, delegate)
            }

        }
    }

    override fun getItemCount(): Int = 12

    override fun onBindViewHolder(holder: BaseNewViewHolder, position: Int) {
    }

    override fun getItemViewType(position: Int): Int {
        return when{
            position % 3 == 0 -> {
                VIEW_TYPE_MRTV
            }
            else -> {
                VIEW_TYPE_ELEVEN
            }

        }

    }




}