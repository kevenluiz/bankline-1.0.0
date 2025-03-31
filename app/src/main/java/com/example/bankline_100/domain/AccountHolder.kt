package com.example.bankline_100.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AccountHolder(
    val id: Int,
) : Parcelable
