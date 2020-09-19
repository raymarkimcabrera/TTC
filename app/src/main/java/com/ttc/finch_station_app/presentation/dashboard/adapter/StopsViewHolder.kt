package com.ttc.finch_station_app.presentation.dashboard.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ttc.finch_station_app.R
import com.ttc.finch_station_app.extensions.hide
import com.ttc.finch_station_app.extensions.inflate
import com.ttc.finch_station_app.extensions.show
import com.ttc.finch_station_app.model.local.Route
import com.ttc.finch_station_app.model.local.Stop
import kotlinx.android.synthetic.main.row_route.view.*
import kotlinx.android.synthetic.main.row_stop.view.*

class StopsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    companion object {
        fun create(parent: ViewGroup): StopsViewHolder {
            return StopsViewHolder(parent.inflate(R.layout.row_stop))
        }
    }

    init {

    }

    fun bindData(item: Stop) = with(itemView) {
        tv_stop_name.text = item.name
        showRoutes(item)
        displayRouteList(item)
    }

    private fun displayRouteList(item: Stop) = with(itemView) {
        item.routes?.let {
            val adapter = RouteAdapter(it)
            rv_route_list.adapter = adapter
        }
    }

    private fun showRoutes(item: Stop) = with(itemView) {
        if (item.routes.isNullOrEmpty()) {
            tv_no_routes_label.show()
            ll_stop_route_layout.hide()
        } else {
            tv_no_routes_label.hide()
            ll_stop_route_layout.show()
        }
    }

    class RouteAdapter(private val items: List<Route>) :
        RecyclerView.Adapter<RouteAdapter.RouteViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
                RouteViewHolder = RouteViewHolder.create(parent)

        override fun onBindViewHolder(holder: RouteViewHolder, position: Int) {
            holder.bindData(items[position])
        }

        override fun getItemCount(): Int = items.size

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
    }
}
