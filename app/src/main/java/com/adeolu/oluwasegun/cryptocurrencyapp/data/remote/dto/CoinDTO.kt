package com.adeolu.oluwasegun.cryptocurrencyapp.data.remote.dto

import com.adeolu.oluwasegun.cryptocurrencyapp.domain.model.Coin
import com.google.gson.annotations.SerializedName

data class CoinDTO(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

//toCoin function will be called to convert coindto to coin
fun CoinDTO.toCoin(): Coin{
    return Coin(
        id= id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}