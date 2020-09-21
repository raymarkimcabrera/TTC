package com.ttc.finch_station_app.presentation.dashboard.adapter

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
import com.ttc.finch_station_app.model.local.Stop
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.row_stop.view.*


class StopsViewHolder(
    private val compositeDisposable: CompositeDisposable,
    itemView: View,
    private val items: List<Stop>,
    private val selectAllListener: RouteAdapter.SeeAllListener
) : RecyclerView.ViewHolder(itemView) {
    companion object {
        fun create(
            compositeDisposable: CompositeDisposable,
            parent: ViewGroup,
            items: List<Stop>,
            selectAllListener: RouteAdapter.SeeAllListener
        ): StopsViewHolder {
            return StopsViewHolder(
                compositeDisposable,
                parent.inflate(R.layout.row_stop),
                items,
                selectAllListener
            )
        }
    }

    init {
        with(itemView) {
            compositeDisposable.addAll(
                iv_stop_expand.clicks().subscribe {
                    if (rl_content.isVisible) {

                        TransitionManager.beginDelayedTransition(
                            rl_content, AutoTransition()
                        )
                        rl_content.hide()
                        iv_stop_expand.setImageResource(R.drawable.ic_expand_more_black_18dp)
                    } else {
                        TransitionManager.beginDelayedTransition(
                            rl_content, AutoTransition()
                        )
                        rl_content.show()
                        iv_stop_expand.setImageResource(R.drawable.ic_expand_less_black_18dp)
                    }
                },
                tv_stop_name.clicks().subscribe {
                    selectAllListener.onSeeAll(items[adapterPosition])
                }
            )
        }

    }

    fun bindData(item: Stop) = with(itemView) {
        tv_stop_name.text = item.name
        showRoutes(item)
        displayRouteList(item)
    }

    private fun displayRouteList(item: Stop) = with(itemView) {
        item.routes?.let {
            if (it.isNotEmpty()){
                val isSizeGreaterThanThree = it.size > 3
                val temp = it.subList(0, if (isSizeGreaterThanThree) 3 else it.size)

                val adapter = RouteAdapter(
                    compositeDisposable,
                    temp,
                    item,
                    selectAllListener
                )
                rv_route_list.adapter = adapter
            }
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
}
