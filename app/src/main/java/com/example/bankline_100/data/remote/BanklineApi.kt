package com.example.bankline_100.data.remote

import com.example.bankline_100.domain.Movement
import retrofit2.http.GET
import retrofit2.http.Path

interface BanklineApi {
    @GET("movimentacoes/{id}")
    suspend fun fidBankStatement(
        @Path("id") accountHolderId: Int,
    ): List<Movement>
}
