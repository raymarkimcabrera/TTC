package com.ttc.finch_station_app.presentation.dashboard.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jakewharton.rxbinding3.view.clicks
import com.ttc.finch_station_app.R
import com.ttc.finch_station_app.extensions.inflate
import com.ttc.finch_station_app.model.local.Route
import com.ttc.finch_station_app.model.local.Stop
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.row_route.view.*
import kotlinx.android.synthetic.main.row_see_all.view.*

class RouteAdapter(
    private val compositeDisposable: CompositeDisposable,
    private val items: List<Route>,
    private val stop: Stop,
    private val selectAllListener: SeeAllListener,
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    interface SeeAllListener {
        fun onSeeAll(stop: Stop)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        return when (viewType) {
            R.layout.row_see_all -> SeeAllViewHolder.create(compositeDisposable, parent)
            else -> RouteViewHolder.create(parent)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when {
            items.isNotEmpty() && position == (itemCount - 1) -> R.layout.row_see_all
            else -> R.layout.row_route
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            R.layout.row_route -> (holder as RouteViewHolder).bindData(items[position])
            else -> (holder as SeeAllViewHolder).bindData(stop, selectAllListener)
        }
    }

    override fun getItemCount(): Int =
        items.size + 1

    class RouteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        companion object {
            fun create(parent: ViewGroup): RouteViewHolder {
                return RouteViewHolder(parent.inflate(R.layout.row_route))
            }
        }

        fun bindData(item: Route) = with(itemView) {
            mtv_route_name.text = item.name
            item.stopTimes?.let {
                val stopTimes = item.stopTimes
                stopTimes.sortedBy { it.departureTimeStamp }
                val nextTrip = stopTimes.first()
                mtv_next_trip_shape.text = nextTrip.shape
                mtv_next_trip_time.text = nextTrip.departureTime
            }

        }
    }

    class SeeAllViewHolder(
        private val compositeDisposable: CompositeDisposable, itemView: View
    ) :
        RecyclerView.ViewHolder(itemView) {
        companion object {
            fun create(
                compositeDisposable: CompositeDisposable,
                parent: ViewGroup
            ): SeeAllViewHolder {
                return SeeAllViewHolder(
                    compositeDisposable,
                    parent.inflate(R.layout.row_see_all)
                )
            }
        }

        fun bindData(stop: Stop, selectAllListener: SeeAllListener) = with(itemView) {
            compositeDisposable.add(
                mtv_see_all.clicks().subscribe {
                    selectAllListener.onSeeAll(stop)
                }
            )
        }
    }
}