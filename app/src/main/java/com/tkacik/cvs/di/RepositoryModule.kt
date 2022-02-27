package com.tkacik.cvs.di

import com.tkacik.cvs.data.local.datasource.FlickrSearchLocalDataSource
import com.tkacik.cvs.data.remote.datasource.FlickrSearchRemoteDataSource
import com.tkacik.cvs.data.repository.FlickrRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun providesFlickRepository(
        localDataSource: FlickrSearchLocalDataSource,
        remoteDataSource: FlickrSearchRemoteDataSource
    ): FlickrRepository {
        return FlickrRepository(localDataSource, remoteDataSource)
    }
}