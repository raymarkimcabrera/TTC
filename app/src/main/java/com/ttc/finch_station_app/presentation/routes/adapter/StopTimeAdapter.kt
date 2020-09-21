package com.ttc.finch_station_app.presentation.routes.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ttc.finch_station_app.R
import com.ttc.finch_station_app.extensions.inflate
import com.ttc.finch_station_app.extensions.parseToTimeString
import com.ttc.finch_station_app.model.local.StopTime
import com.ttc.finch_station_app.presentation.dashboard.adapter.StopsViewHolder
import kotlinx.android.synthetic.main.row_stop_times.view.*

class StopTimeAdapter(private val items: List<StopTime>) :
    RecyclerView.Adapter<StopTimeAdapter.StopTimeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StopTimeViewHolder =
        StopTimeViewHolder.create(parent)

    override fun onBindViewHolder(holder: StopTimeViewHolder, position: Int) {
        holder.bindData(items[position])
    }

    override fun getItemCount(): Int = items.size

    class StopTimeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        companion object {
            fun create(parent: ViewGroup): StopTimeViewHolder {
                return StopTimeViewHolder(parent.inflate(R.layout.row_stop_times))
            }
        }

        fun bindData(item: StopTime) = with(itemView) {
            mtv_stop_route_shape.text = item.shape
            mtv_departure_time.text = item.departureTimeStamp.parseToTimeString()
        }
    }

}