package com.tkacik.cvs.data.local.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/tkacik/cvs/data/local/datasource/FlickrSearchLocalDataSource;", "", "flickrDao", "Lcom/tkacik/cvs/data/local/database/FlickrDao;", "(Lcom/tkacik/cvs/data/local/database/FlickrDao;)V", "getUserQueries", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/tkacik/cvs/data/local/database/FlickrSearch;", "insertSearch", "", "search", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FlickrSearchLocalDataSource {
    private final com.tkacik.cvs.data.local.database.FlickrDao flickrDao = null;
    
    @javax.inject.Inject()
    public FlickrSearchLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.tkacik.cvs.data.local.database.FlickrDao flickrDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.tkacik.cvs.data.local.database.FlickrSearch>> getUserQueries() {
        return null;
    }
}