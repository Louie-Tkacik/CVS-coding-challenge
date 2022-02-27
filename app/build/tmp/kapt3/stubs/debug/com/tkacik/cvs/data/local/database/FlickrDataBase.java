package com.tkacik.cvs.data.local.database;

import java.lang.System;

@androidx.room.Database(entities = {com.tkacik.cvs.data.local.database.FlickrSearch.class}, version = 1, exportSchema = true)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/tkacik/cvs/data/local/database/FlickrDataBase;", "Landroidx/room/RoomDatabase;", "()V", "getFlickrDao", "Lcom/tkacik/cvs/data/local/database/FlickrDao;", "app_debug"})
public abstract class FlickrDataBase extends androidx.room.RoomDatabase {
    
    public FlickrDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.tkacik.cvs.data.local.database.FlickrDao getFlickrDao();
}