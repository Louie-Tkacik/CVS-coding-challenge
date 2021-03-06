// Generated by Dagger (https://dagger.dev).
package com.tkacik.cvs.data.local.datasource;

import com.tkacik.cvs.data.local.database.FlickrDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FlickrSearchLocalDataSource_Factory implements Factory<FlickrSearchLocalDataSource> {
  private final Provider<FlickrDao> flickrDaoProvider;

  public FlickrSearchLocalDataSource_Factory(Provider<FlickrDao> flickrDaoProvider) {
    this.flickrDaoProvider = flickrDaoProvider;
  }

  @Override
  public FlickrSearchLocalDataSource get() {
    return newInstance(flickrDaoProvider.get());
  }

  public static FlickrSearchLocalDataSource_Factory create(Provider<FlickrDao> flickrDaoProvider) {
    return new FlickrSearchLocalDataSource_Factory(flickrDaoProvider);
  }

  public static FlickrSearchLocalDataSource newInstance(FlickrDao flickrDao) {
    return new FlickrSearchLocalDataSource(flickrDao);
  }
}
