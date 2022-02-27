package com.tkacik.cvs.data.local.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FlickrDao_Impl extends FlickrDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FlickrSearch> __insertionAdapterOfFlickrSearch;

  private final SharedSQLiteStatement __preparedStmtOfDeleteOldestSearch;

  public FlickrDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFlickrSearch = new EntityInsertionAdapter<FlickrSearch>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `flickr_search` (`id`,`search`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FlickrSearch value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getSearch() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSearch());
        }
      }
    };
    this.__preparedStmtOfDeleteOldestSearch = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM flickr_search WHERE id IN (SELECT id FROM flickr_search ORDER BY id DESC LIMIT 1 OFFSET 4)";
        return _query;
      }
    };
  }

  @Override
  public Object insertSearch(final FlickrSearch search,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFlickrSearch.insert(search);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertAndDeleteExtraQueries(final FlickrSearch search,
      final Continuation<? super Unit> continuation) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> FlickrDao_Impl.super.insertAndDeleteExtraQueries(search, __cont), continuation);
  }

  @Override
  public Object deleteOldestSearch(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteOldestSearch.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteOldestSearch.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<FlickrSearch>> getUserQueries() {
    final String _sql = "SELECT `flickr_search`.`id` AS `id`, `flickr_search`.`search` AS `search` FROM flickr_search";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"flickr_search"}, new Callable<List<FlickrSearch>>() {
      @Override
      public List<FlickrSearch> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = 0;
          final int _cursorIndexOfSearch = 1;
          final List<FlickrSearch> _result = new ArrayList<FlickrSearch>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FlickrSearch _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpSearch;
            if (_cursor.isNull(_cursorIndexOfSearch)) {
              _tmpSearch = null;
            } else {
              _tmpSearch = _cursor.getString(_cursorIndexOfSearch);
            }
            _item = new FlickrSearch(_tmpId,_tmpSearch);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
