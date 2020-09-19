package com.ttc.finch_station_app.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lcom/ttc/finch_station_app/di/Schedulers;", "", "computation", "Lio/reactivex/Scheduler;", "io", "pagingExecutor", "Ljava/util/concurrent/Executor;", "single", "trampoline", "ui", "app_debug"})
public abstract interface Schedulers {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Scheduler ui();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Scheduler io();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Scheduler single();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Scheduler computation();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Scheduler trampoline();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.concurrent.Executor pagingExecutor();
}