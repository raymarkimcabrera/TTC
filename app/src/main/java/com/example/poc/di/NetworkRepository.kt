package com.example.poc.di

import com.example.poc.model.Post
import io.reactivex.Observable

interface NetworkRepository {

    fun getPosts(): Observable<List<Post>>
}