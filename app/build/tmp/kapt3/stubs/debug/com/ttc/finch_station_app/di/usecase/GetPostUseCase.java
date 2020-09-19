package com.ttc.finch_station_app.di.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ttc/finch_station_app/di/usecase/GetPostUseCase;", "", "schedulers", "Lcom/ttc/finch_station_app/di/Schedulers;", "networkRepository", "Lcom/ttc/finch_station_app/di/NetworkRepository;", "(Lcom/ttc/finch_station_app/di/Schedulers;Lcom/ttc/finch_station_app/di/NetworkRepository;)V", "execute", "Lio/reactivex/Observable;", "", "Lcom/ttc/finch_station_app/model/Post;", "app_debug"})
@javax.inject.Singleton()
public final class GetPostUseCase {
    private final com.ttc.finch_station_app.di.Schedulers schedulers = null;
    private final com.ttc.finch_station_app.di.NetworkRepository networkRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.ttc.finch_station_app.model.Post>> execute() {
        return null;
    }
    
    @javax.inject.Inject()
    public GetPostUseCase(@org.jetbrains.annotations.NotNull()
    com.ttc.finch_station_app.di.Schedulers schedulers, @org.jetbrains.annotations.NotNull()
    com.ttc.finch_station_app.di.NetworkRepository networkRepository) {
        super();
    }
}