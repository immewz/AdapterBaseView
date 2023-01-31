package com.padcmyanmar.mewz.adapterbaseview.viewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.mewz.adapterbaseview.Delegate.NewItemActionDelegate

abstract class BaseNewViewHolder(itemView : View, delegate: NewItemActionDelegate) : RecyclerView.ViewHolder(itemView) {

    init {
        itemView.setOnClickListener {
            delegate.onTopNews()
        }
    }
}