package com.example.bankline_100.domain

data class Movement(
    val id: Int,
    val dateTime: String,
    val description: String,
    val value: Double,
    val type: TypeMovement,
    // TODO Mapear "IdConta -> IdCorrentista"
    val idCorrentista: Int,
)
