package com.adeolu.oluwasegun.cryptocurrencyapp.di

import com.adeolu.oluwasegun.cryptocurrencyapp.common.Constants
import com.adeolu.oluwasegun.cryptocurrencyapp.data.remote.CoinAPISource
import com.adeolu.oluwasegun.cryptocurrencyapp.data.repository.CoinRepositoryImplementation
import com.adeolu.oluwasegun.cryptocurrencyapp.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi(): CoinAPISource{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinAPISource::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinAPISource): CoinRepository{
        return CoinRepositoryImplementation(api)
    }


}