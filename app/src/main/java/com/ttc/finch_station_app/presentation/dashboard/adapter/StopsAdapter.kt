package com.ttc.finch_station_app.presentation.dashboard.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ttc.finch_station_app.R
import com.ttc.finch_station_app.extensions.inflate
import com.ttc.finch_station_app.model.response.Stop
import kotlinx.android.synthetic.main.row_stop.view.*

class StopsAdapter(private var items: List<Stop>) : RecyclerView.Adapter<StopsAdapter.StopsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            StopsViewHolder = StopsViewHolder.create(parent)


    override fun onBindViewHolder(holder: StopsViewHolder, position: Int) {
        holder.bindData(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun updateItemList(items: List<Stop>){
        this.items = items
        notifyDataSetChanged()
    }

    class StopsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        companion object {
            fun create(parent: ViewGroup): StopsViewHolder {
                return StopsViewHolder(parent.inflate(R.layout.row_stop))
            }
        }

        init {

        }

        fun bindData(item: Stop)= with(itemView) {
            tv_stop_name.text = item.name
        }
    }

}