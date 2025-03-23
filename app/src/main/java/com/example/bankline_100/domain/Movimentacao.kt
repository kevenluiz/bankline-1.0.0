package com.example.bankline_100.domain

data class Movimentacao(

    val id: Int,
    val dataHora: String,
    val descricao: String,
    val valor: Double,
    val tipo: TipoMovimentacao,
    // TODO Mapear "IdConta -> IdCorrentista"
    val idCorrentista: Int
)
