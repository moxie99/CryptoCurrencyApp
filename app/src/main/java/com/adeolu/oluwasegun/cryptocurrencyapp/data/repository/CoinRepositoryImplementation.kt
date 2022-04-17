package com.adeolu.oluwasegun.cryptocurrencyapp.data.repository

import com.adeolu.oluwasegun.cryptocurrencyapp.data.remote.CoinAPISource
import com.adeolu.oluwasegun.cryptocurrencyapp.data.remote.dto.CoinDTO
import com.adeolu.oluwasegun.cryptocurrencyapp.data.remote.dto.CoinDetialDto
import com.adeolu.oluwasegun.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImplementation @Inject constructor(
    private val api: CoinAPISource
): CoinRepository{
    override suspend fun getCoins(): List<CoinDTO> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetialDto {
        return api.getCoinById(coinId)
    }


}