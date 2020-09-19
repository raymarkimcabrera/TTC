package com.ttc.finch_station_app.di

import com.ttc.finch_station_app.model.Post
import io.reactivex.Observable

interface NetworkRepository {

    fun getPosts(): Observable<List<Post>>
}