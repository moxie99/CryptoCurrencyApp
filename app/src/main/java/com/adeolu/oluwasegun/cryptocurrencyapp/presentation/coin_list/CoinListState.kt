package com.adeolu.oluwasegun.cryptocurrencyapp.presentation.coin_list

import com.adeolu.oluwasegun.cryptocurrencyapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
