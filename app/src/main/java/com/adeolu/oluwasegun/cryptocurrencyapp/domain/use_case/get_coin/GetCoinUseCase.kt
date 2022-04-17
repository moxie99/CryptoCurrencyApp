package com.adeolu.oluwasegun.cryptocurrencyapp.domain.use_case.get_coin

import com.adeolu.oluwasegun.cryptocurrencyapp.common.Resource
import com.adeolu.oluwasegun.cryptocurrencyapp.data.remote.dto.toCoin
import com.adeolu.oluwasegun.cryptocurrencyapp.data.remote.dto.toCoinDetail
import com.adeolu.oluwasegun.cryptocurrencyapp.domain.model.Coin
import com.adeolu.oluwasegun.cryptocurrencyapp.domain.model.CoinDetail
import com.adeolu.oluwasegun.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.util.concurrent.Flow
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): kotlinx.coroutines.flow.Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        }catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage?: "An unexpected error occured"))
        }catch(e: IOException){
            emit(Resource.Error("Could not reach the server. Check your internet connection."))
        }
    }
}