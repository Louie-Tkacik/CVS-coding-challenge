package com.tkacik.cvs.data.repository

import com.tkacik.cvs.data.local.database.FlickrSearch
import com.tkacik.cvs.data.local.datasource.FlickrSearchLocalDataSource
import com.tkacik.cvs.data.remote.datasource.FlickrSearchRemoteDataSource
import com.tkacik.cvs.data.remote.dto.FlickrResponse
import com.tkacik.cvs.utils.NetworkResult
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FlickrRepository @Inject constructor(
    private val localDataSource: FlickrSearchLocalDataSource,
    private val remoteDataSource: FlickrSearchRemoteDataSource
) : CoroutineScope by CoroutineScope(SupervisorJob() + Dispatchers.IO) {

    fun getUserQueries(): Flow<List<FlickrSearch>> {
        return localDataSource.getUserQueries()
    }

    suspend fun getFlickrResponse(tags: String): NetworkResult<FlickrResponse> {
        val result = NetworkResult.invoke {
            remoteDataSource.getFlickrResponse(tags)
        }
        return when (result) {
            is NetworkResult.Success -> {
                localDataSource.insertSearch(tags)
                result
            }
            is NetworkResult.Failure -> {
                result
            }
        }
    }
}