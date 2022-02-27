package com.tkacik.cvs.data.local.datasource

import com.tkacik.cvs.data.local.database.FlickrDao
import com.tkacik.cvs.data.local.database.FlickrSearch
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FlickrSearchLocalDataSource @Inject constructor(
    private val flickrDao: FlickrDao
) {
    suspend fun insertSearch(search: String) {
        flickrDao.insertAndDeleteExtraQueries(FlickrSearch(search = search))
    }

    fun getUserQueries(): Flow<List<FlickrSearch>> {
        return flickrDao.getUserQueries()
    }
}