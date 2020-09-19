package com.ttc.finch_station_app.di

import io.reactivex.Scheduler
import java.util.concurrent.Executor

interface Schedulers {
    fun ui(): Scheduler

    fun io(): Scheduler

    fun single(): Scheduler

    fun computation(): Scheduler

    fun trampoline(): Scheduler

    fun pagingExecutor(): Executor
}