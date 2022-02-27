package com.tkacik.cvs.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012R\u0012\u0010\u0007\u001a\u00020\bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/tkacik/cvs/data/repository/FlickrRepository;", "Lkotlinx/coroutines/CoroutineScope;", "localDataSource", "Lcom/tkacik/cvs/data/local/datasource/FlickrSearchLocalDataSource;", "remoteDataSource", "Lcom/tkacik/cvs/data/remote/datasource/FlickrSearchRemoteDataSource;", "(Lcom/tkacik/cvs/data/local/datasource/FlickrSearchLocalDataSource;Lcom/tkacik/cvs/data/remote/datasource/FlickrSearchRemoteDataSource;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getFlickrResponse", "Lcom/tkacik/cvs/utils/NetworkResult;", "Lcom/tkacik/cvs/data/remote/dto/FlickrResponse;", "tags", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserQueries", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/tkacik/cvs/data/local/database/FlickrSearch;", "app_debug"})
public final class FlickrRepository implements kotlinx.coroutines.CoroutineScope {
    private final com.tkacik.cvs.data.local.datasource.FlickrSearchLocalDataSource localDataSource = null;
    private final com.tkacik.cvs.data.remote.datasource.FlickrSearchRemoteDataSource remoteDataSource = null;
    
    @javax.inject.Inject()
    public FlickrRepository(@org.jetbrains.annotations.NotNull()
    com.tkacik.cvs.data.local.datasource.FlickrSearchLocalDataSource localDataSource, @org.jetbrains.annotations.NotNull()
    com.tkacik.cvs.data.remote.datasource.FlickrSearchRemoteDataSource remoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.tkacik.cvs.data.local.database.FlickrSearch>> getUserQueries() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFlickrResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String tags, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.tkacik.cvs.utils.NetworkResult<com.tkacik.cvs.data.remote.dto.FlickrResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
}