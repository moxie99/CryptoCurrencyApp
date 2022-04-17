package com.adeolu.oluwasegun.cryptocurrencyapp.data.remote.dto

data class CoinDTO(
    val id: String,
    val is_active: Boolean,
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)