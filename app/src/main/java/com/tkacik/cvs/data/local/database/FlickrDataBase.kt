package com.tkacik.cvs.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [FlickrSearch::class], version = 1, exportSchema = true)
abstract class FlickrDataBase : RoomDatabase() {

    abstract fun getFlickrDao(): FlickrDao
}