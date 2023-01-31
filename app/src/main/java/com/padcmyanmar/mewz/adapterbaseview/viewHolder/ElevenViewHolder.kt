package com.padcmyanmar.mewz.adapterbaseview.viewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.mewz.adapterbaseview.Delegate.NewItemActionDelegate

class ElevenViewHolder(itemView : View,delegate: NewItemActionDelegate) : BaseNewViewHolder(itemView,delegate){

    init {
        itemView.setOnClickListener {
            delegate.onTopNews()
        }
    }
}