// Generated by Dagger (https://dagger.dev).
package com.tkacik.cvs.di;

import com.tkacik.cvs.data.local.database.FlickrDao;
import com.tkacik.cvs.data.local.database.FlickrDataBase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvidesCommentDaoFactory implements Factory<FlickrDao> {
  private final Provider<FlickrDataBase> databaseProvider;

  public DatabaseModule_ProvidesCommentDaoFactory(Provider<FlickrDataBase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public FlickrDao get() {
    return providesCommentDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvidesCommentDaoFactory create(
      Provider<FlickrDataBase> databaseProvider) {
    return new DatabaseModule_ProvidesCommentDaoFactory(databaseProvider);
  }

  public static FlickrDao providesCommentDao(FlickrDataBase database) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.providesCommentDao(database));
  }
}