package com.example.poc.di.usecase

import com.example.poc.di.NetworkRepository
import com.example.poc.di.Schedulers
import com.example.poc.model.Post
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