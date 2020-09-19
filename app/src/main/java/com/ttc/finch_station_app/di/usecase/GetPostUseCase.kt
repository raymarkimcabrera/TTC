package com.ttc.finch_station_app.di.usecase

import com.ttc.finch_station_app.di.NetworkRepository
import com.ttc.finch_station_app.di.Schedulers
import com.ttc.finch_station_app.model.Post
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetPostUseCase @Inject constructor(private val schedulers: Schedulers,
                                         private val networkRepository: NetworkRepository){

    fun execute(): Observable<List<Post>>{
        return networkRepository.getPosts()
            .subscribeOn(schedulers.io())
            .observeOn(schedulers.ui())
    }
}