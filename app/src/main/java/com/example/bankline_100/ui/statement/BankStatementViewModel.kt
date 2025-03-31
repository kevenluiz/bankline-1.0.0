package com.example.bankline_100.ui.statement

import androidx.lifecycle.ViewModel
import com.example.bankline_100.data.BanklineRepository

class BankStatementViewModel : ViewModel() {
    fun findBankStatement(accountHolderId: Int) = BanklineRepository.findBankStatement(accountHolderId)
}
