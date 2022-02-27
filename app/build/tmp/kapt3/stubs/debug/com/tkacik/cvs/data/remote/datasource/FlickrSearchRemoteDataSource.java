package com.tkacik.cvs.data.remote.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/tkacik/cvs/data/remote/datasource/FlickrSearchRemoteDataSource;", "", "flickrService", "Lcom/tkacik/cvs/data/remote/service/FlickrService;", "(Lcom/tkacik/cvs/data/remote/service/FlickrService;)V", "getFlickrResponse", "Lretrofit2/Response;", "Lcom/tkacik/cvs/data/remote/dto/FlickrResponse;", "tags", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FlickrSearchRemoteDataSource {
    private final com.tkacik.cvs.data.remote.service.FlickrService flickrService = null;
    
    @javax.inject.Inject()
    public FlickrSearchRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.tkacik.cvs.data.remote.service.FlickrService flickrService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFlickrResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String tags, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tkacik.cvs.data.remote.dto.FlickrResponse>> continuation) {
        return null;
    }
}