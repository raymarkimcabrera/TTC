package com.ttc.finch_station_app.presentation.routes.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jakewharton.rxbinding3.view.clicks
import com.ttc.finch_station_app.R
import com.ttc.finch_station_app.extensions.inflate
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
//                    if (rl_content.isVisible) {
//
//                        TransitionManager.beginDelayedTransition(
//                            rl_content, AutoTransition()
//                        )
//                        rl_content.hide()
//                        iv_stop_expand.setImageResource(R.drawable.ic_expand_more_black_18dp)
//                    } else {
//                        TransitionManager.beginDelayedTransition(
//                            rl_content, AutoTransition()
//                        )
//                        rl_content.show()
//                        iv_stop_expand.setImageResource(R.drawable.ic_expand_less_black_18dp)
//                    }
                })
            }
        }

        fun bindData(item: Route) = with(itemView) {
            tv_route_name.text = item.name
        }
    }
}