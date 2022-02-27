package com.tkacik.cvs.data.local.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\'J\u0019\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tH\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/tkacik/cvs/data/local/database/FlickrDao;", "", "()V", "deleteOldestSearch", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserQueries", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/tkacik/cvs/data/local/database/FlickrSearch;", "insertAndDeleteExtraQueries", "search", "(Lcom/tkacik/cvs/data/local/database/FlickrSearch;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSearch", "app_debug"})
public abstract class FlickrDao {
    
    public FlickrDao() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM flickr_search")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.tkacik.cvs.data.local.database.FlickrSearch>> getUserQueries();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insertSearch(@org.jetbrains.annotations.NotNull()
    com.tkacik.cvs.data.local.database.FlickrSearch search, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM flickr_search WHERE id IN (SELECT id FROM flickr_search ORDER BY id DESC LIMIT 1 OFFSET 4)")
    public abstract java.lang.Object deleteOldestSearch(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Transaction()
    public java.lang.Object insertAndDeleteExtraQueries(@org.jetbrains.annotations.NotNull()
    com.tkacik.cvs.data.local.database.FlickrSearch search, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}