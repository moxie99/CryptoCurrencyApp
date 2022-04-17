package com.adeolu.oluwasegun.cryptocurrencyapp.domain.repository

import com.adeolu.oluwasegun.cryptocurrencyapp.data.remote.dto.CoinDTO
import com.adeolu.oluwasegun.cryptocurrencyapp.data.remote.dto.CoinDetialDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDTO>

    suspend fun getCoinById(coinId: String): CoinDetialDto
}