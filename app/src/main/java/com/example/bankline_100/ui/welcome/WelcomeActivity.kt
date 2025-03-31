package com.example.bankline_100.ui.welcome

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bankline_100.databinding.ActivityWelcomeBinding
import com.example.bankline_100.domain.AccountHolder
import com.example.bankline_100.ui.statement.BankStatementActivity

class WelcomeActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityWelcomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btContinue.setOnClickListener {
            val accountHolderId =
                binding.etAccountHolderId.text
                    .toString()
                    .toInt()
            val accountHolder = AccountHolder(accountHolderId)

            val intent =
                Intent(this, BankStatementActivity::class.java).apply {
                    putExtra(BankStatementActivity.EXTRA_ACCOUNT_HOLDER, accountHolder)
                }
            startActivity(intent)
        }
    }
}
