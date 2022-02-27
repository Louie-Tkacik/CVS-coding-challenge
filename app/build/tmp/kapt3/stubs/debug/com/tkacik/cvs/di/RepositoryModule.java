package com.tkacik.cvs.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/tkacik/cvs/di/RepositoryModule;", "", "()V", "providesFlickRepository", "Lcom/tkacik/cvs/data/repository/FlickrRepository;", "localDataSource", "Lcom/tkacik/cvs/data/local/datasource/FlickrSearchLocalDataSource;", "remoteDataSource", "Lcom/tkacik/cvs/data/remote/datasource/FlickrSearchRemoteDataSource;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.tkacik.cvs.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.tkacik.cvs.data.repository.FlickrRepository providesFlickRepository(@org.jetbrains.annotations.NotNull()
    com.tkacik.cvs.data.local.datasource.FlickrSearchLocalDataSource localDataSource, @org.jetbrains.annotations.NotNull()
    com.tkacik.cvs.data.remote.datasource.FlickrSearchRemoteDataSource remoteDataSource) {
        return null;
    }
}