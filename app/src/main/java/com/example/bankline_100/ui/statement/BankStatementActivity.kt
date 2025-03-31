package com.example.bankline_100.ui.statement

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bankline_100.data.State
import com.example.bankline_100.databinding.ActivityBankStatementBinding
import com.example.bankline_100.domain.AccountHolder
import com.google.android.material.snackbar.Snackbar

class BankStatementActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_ACCOUNT_HOLDER =
            "com.example.bankline_100.ui.statement.EXTRA_ACCOUNT_HOLDER"
    }

    private val binding by lazy {
        ActivityBankStatementBinding.inflate(layoutInflater)
    }

    private val accountHolder by lazy {
        intent.getParcelableExtra<AccountHolder>(EXTRA_ACCOUNT_HOLDER)
            ?: throw IllegalArgumentException()
    }

    private val viewModel by viewModels<BankStatementViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvBankStatement.layoutManager = LinearLayoutManager(this)

        findBankStatement()
    }

    private fun findBankStatement() {
        viewModel.findBankStatement(accountHolder.id).observe(this) { state ->
            when (state) {
                is State.Success -> {
                    binding.rvBankStatement.adapter = state.data?.let { BankStatementAdapter(it) }
                    binding.srlBankStatement.isRefreshing = false
                }
                is State.Error -> {
                    state.message?.let { Snackbar.make(binding.rvBankStatement, it, Snackbar.LENGTH_LONG).show() }
                    binding.srlBankStatement.isRefreshing = false
                }
                State.Wait -> {
                    binding.srlBankStatement.isRefreshing = true
                }
            }
        }
    }
}
