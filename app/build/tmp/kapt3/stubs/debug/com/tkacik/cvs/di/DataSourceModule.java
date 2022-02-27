package com.tkacik.cvs.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/tkacik/cvs/di/DataSourceModule;", "", "()V", "providesFlickrSearchLocalDataSource", "Lcom/tkacik/cvs/data/local/datasource/FlickrSearchLocalDataSource;", "flickrDao", "Lcom/tkacik/cvs/data/local/database/FlickrDao;", "providesFlickrSearchRemoteDataSource", "Lcom/tkacik/cvs/data/remote/datasource/FlickrSearchRemoteDataSource;", "flickrService", "Lcom/tkacik/cvs/data/remote/service/FlickrService;", "app_debug"})
@dagger.Module()
public final class DataSourceModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.tkacik.cvs.di.DataSourceModule INSTANCE = null;
    
    private DataSourceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.tkacik.cvs.data.local.datasource.FlickrSearchLocalDataSource providesFlickrSearchLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.tkacik.cvs.data.local.database.FlickrDao flickrDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.tkacik.cvs.data.remote.datasource.FlickrSearchRemoteDataSource providesFlickrSearchRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.tkacik.cvs.data.remote.service.FlickrService flickrService) {
        return null;
    }
}