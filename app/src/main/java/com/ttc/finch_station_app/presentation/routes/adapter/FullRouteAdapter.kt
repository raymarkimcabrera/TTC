package com.ttc.finch_station_app.presentation.routes.adapter

import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager
import com.jakewharton.rxbinding3.view.clicks
import com.ttc.finch_station_app.R
import com.ttc.finch_station_app.extensions.hide
import com.ttc.finch_station_app.extensions.inflate
import com.ttc.finch_station_app.extensions.show
import com.ttc.finch_station_app.model.local.Route
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.row_full_routes.view.*

class FullRouteAdapter(
    private val compositeDisposable: CompositeDisposable,
    private val items: List<Route>
) : RecyclerView.Adapter<FullRouteAdapter.FullRouteViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FullRouteViewHolder =
        FullRouteViewHolder.create(compositeDisposable, parent)

    override fun onBindViewHolder(holder: FullRouteViewHolder, position: Int) {
        holder.bindData(items[position])
    }

    override fun getItemCount(): Int = items.size

    class FullRouteViewHolder(
        compositeDisposable: CompositeDisposable,
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        companion object {
            fun create(
                compositeDisposable: CompositeDisposable,
                parent: ViewGroup
            ): FullRouteViewHolder {
                return FullRouteViewHolder(
                    compositeDisposable,
                    parent.inflate(R.layout.row_full_routes)
                )
            }
        }

        init {
            with(itemView) {

                compositeDisposable.add(iv_route_expand.clicks().subscribe {
                    if (ll_stop_route_layout.isVisible) {

                        TransitionManager.beginDelayedTransition(
                            ll_stop_route_layout, AutoTransition()
                        )
                        ll_stop_route_layout.hide()
                        iv_route_expand.setImageResource(R.drawable.ic_expand_more_black_18dp)
                    } else {
                        TransitionManager.beginDelayedTransition(
                            ll_stop_route_layout, AutoTransition()
                        )
                        ll_stop_route_layout.show()
                        iv_route_expand.setImageResource(R.drawable.ic_expand_less_black_18dp)
                    }
                })
            }
        }

        fun bindData(item: Route) = with(itemView) {
            tv_route_name.text = item.name

            item.stopTimes?.let {
                val adapter = StopTimeAdapter(it)
                rv_stop_times_list.adapter = adapter
            }

        }
    }
}