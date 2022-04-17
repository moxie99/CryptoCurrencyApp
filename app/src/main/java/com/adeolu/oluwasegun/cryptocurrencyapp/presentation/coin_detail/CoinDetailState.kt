package com.adeolu.oluwasegun.cryptocurrencyapp.presentation.coin_detail

import com.adeolu.oluwasegun.cryptocurrencyapp.domain.model.Coin
import com.adeolu.oluwasegun.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
