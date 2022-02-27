// Generated by Dagger (https://dagger.dev).
package com.tkacik.cvs.di;

import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesRetrofitFactory implements Factory<Retrofit> {
  private final Provider<Moshi> moshiProvider;

  private final Provider<OkHttpClient> clientProvider;

  public NetworkModule_ProvidesRetrofitFactory(Provider<Moshi> moshiProvider,
      Provider<OkHttpClient> clientProvider) {
    this.moshiProvider = moshiProvider;
    this.clientProvider = clientProvider;
  }

  @Override
  public Retrofit get() {
    return providesRetrofit(moshiProvider.get(), clientProvider.get());
  }

  public static NetworkModule_ProvidesRetrofitFactory create(Provider<Moshi> moshiProvider,
      Provider<OkHttpClient> clientProvider) {
    return new NetworkModule_ProvidesRetrofitFactory(moshiProvider, clientProvider);
  }

  public static Retrofit providesRetrofit(Moshi moshi, OkHttpClient client) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providesRetrofit(moshi, client));
  }
}
