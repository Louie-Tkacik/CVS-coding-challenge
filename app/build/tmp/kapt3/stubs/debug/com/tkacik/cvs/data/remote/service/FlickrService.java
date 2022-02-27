package com.tkacik.cvs.data.remote.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/tkacik/cvs/data/remote/service/FlickrService;", "", "getFlickrResponse", "Lretrofit2/Response;", "Lcom/tkacik/cvs/data/remote/dto/FlickrResponse;", "format", "", "noJsonCallBack", "", "tags", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface FlickrService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "services/feeds/photos_public.gne")
    public abstract java.lang.Object getFlickrResponse(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "format")
    java.lang.String format, @retrofit2.http.Query(value = "nojsoncallback")
    int noJsonCallBack, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "tags")
    java.lang.String tags, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tkacik.cvs.data.remote.dto.FlickrResponse>> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}