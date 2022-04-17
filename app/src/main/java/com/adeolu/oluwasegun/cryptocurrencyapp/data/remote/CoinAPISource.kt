package com.adeolu.oluwasegun.cryptocurrencyapp.data.remote

import com.adeolu.oluwasegun.cryptocurrencyapp.data.remote.dto.CoinDTO
import com.adeolu.oluwasegun.cryptocurrencyapp.data.remote.dto.CoinDetialDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinAPISource {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDTO>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId")coinId: String): CoinDetialDto


}