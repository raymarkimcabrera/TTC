package com.ttc.finch_station_app.presentation.dashboard.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ttc.finch_station_app.R
import com.ttc.finch_station_app.extensions.inflate
import com.ttc.finch_station_app.model.local.Route
import kotlinx.android.synthetic.main.row_route.view.*

class RouteAdapter(
    private val items: List<Route>,
    private val isSizeGreaterThanThree: Boolean
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        return when (viewType) {
            R.layout.row_see_all -> SeeAllViewHolder.create(parent)
            else -> RouteViewHolder.create(parent)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when {
            isSizeGreaterThanThree && position == (itemCount - 1) -> R.layout.row_see_all
            else -> R.layout.row_route
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            R.layout.row_route -> (holder as RouteViewHolder).bindData(items[position])
            else -> SeeAllViewHolder
        }
    }

    override fun getItemCount(): Int =
        if (isSizeGreaterThanThree)
            items.size + 1
        else items.size

    class RouteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        companion object {
            fun create(parent: ViewGroup): RouteViewHolder {
                return RouteViewHolder(parent.inflate(R.layout.row_route))
            }
        }

        fun bindData(item: Route) = with(itemView) {
            mtv_route_name.text = item.name
        }
    }

    class SeeAllViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        companion object {
            fun create(parent: ViewGroup): RouteViewHolder {
                return RouteViewHolder(parent.inflate(R.layout.row_see_all))
            }
        }
    }
}