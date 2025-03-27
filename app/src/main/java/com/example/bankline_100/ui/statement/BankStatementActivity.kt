package com.example.bankline_100.ui.statement

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bankline_100.R
import com.example.bankline_100.databinding.ActivityBankStatementBinding
import com.example.bankline_100.databinding.ActivityWelcomeBinding
import com.example.bankline_100.domain.Correntista
import com.example.bankline_100.domain.Movimentacao
import com.example.bankline_100.domain.TipoMovimentacao

class BankStatementActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_ACCOUNT_HOLDER = "com.example.bankline_100.ui.statement.EXTRA_ACCOUNT_HOLDER"
    }

    private val binding by lazy {
        ActivityBankStatementBinding.inflate(layoutInflater)


    }

    private val accountHolder by lazy {
        intent.getParcelableExtra<Correntista>(EXTRA_ACCOUNT_HOLDER) ?: throw IllegalArgumentException()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvBankStatement.layoutManager = LinearLayoutManager(this)

        findBankStatement()
    }

    private fun findBankStatement() {
        val dataSet = ArrayList<Movimentacao>()
        dataSet.add(Movimentacao(
            id = 1,
            dataHora = "26/03/2025 22:09:30",
            descricao = "Entrada",
            valor = 1000.0,
            TipoMovimentacao.RECEITA,
            idCorrentista = 1)
        )

        dataSet.add(Movimentacao(
            id = 1,
            dataHora = "26/03/2025 22:09:30",
            descricao = "Entrada",
            valor = 1000.0,
            TipoMovimentacao.RECEITA,
            idCorrentista = 1)
        )

        dataSet.add(Movimentacao(
            id = 1,
            dataHora = "26/03/2025 22:09:30",
            descricao = "Saida",
            valor = 1000.0,
            TipoMovimentacao.DESPESA,
            idCorrentista = 1)
        )

        dataSet.add(Movimentacao(
            id = 1,
            dataHora = "26/03/2025 22:09:30",
            descricao = "Entrada",
            valor = 1000.0,
            TipoMovimentacao.RECEITA,
            idCorrentista = 1)
        )
        dataSet.add(Movimentacao(
            id = 1,
            dataHora = "26/03/2025 22:09:30",
            descricao = "Saida",
            valor = 1000.0,
            TipoMovimentacao.DESPESA,
            idCorrentista = 1)
        )

        dataSet.add(Movimentacao(
            id = 1,
            dataHora = "26/03/2025 22:09:30",
            descricao = "Entrada",
            valor = 1000.0,
            TipoMovimentacao.RECEITA,
            idCorrentista = 1)
        )

        dataSet.add(Movimentacao(
            id = 1,
            dataHora = "26/03/2025 22:09:30",
            descricao = "Saida",
            valor = 1000.0,
            TipoMovimentacao.DESPESA,
            idCorrentista = 1)
        )
        dataSet.add(Movimentacao(
            id = 1,
            dataHora = "26/03/2025 22:09:30",
            descricao = "Saida",
            valor = 1000.0,
            TipoMovimentacao.DESPESA,
            idCorrentista = 1)
        )

        dataSet.add(Movimentacao(
            id = 1,
            dataHora = "26/03/2025 22:09:30",
            descricao = "Saida",
            valor = 1000.0,
            TipoMovimentacao.DESPESA,
            idCorrentista = 1)
        )

        dataSet.add(Movimentacao(
            id = 1,
            dataHora = "26/03/2025 22:09:30",
            descricao = "Saida",
            valor = 1000.0,
            TipoMovimentacao.DESPESA,
            idCorrentista = 1)
        )

        dataSet.add(Movimentacao(
            id = 1,
            dataHora = "26/03/2025 22:09:30",
            descricao = "Saida",
            valor = 1000.0,
            TipoMovimentacao.DESPESA,
            idCorrentista = 1)
        )

        dataSet.add(Movimentacao(
            id = 1,
            dataHora = "26/03/2025 22:09:30",
            descricao = "Saida",
            valor = 1000.0,
            TipoMovimentacao.DESPESA,
            idCorrentista = 1)
        )

        dataSet.add(Movimentacao(
            id = 1,
            dataHora = "26/03/2025 22:09:30",
            descricao = "Saida",
            valor = 1000.0,
            TipoMovimentacao.DESPESA,
            idCorrentista = 1)
        )

        dataSet.add(Movimentacao(
            id = 1,
            dataHora = "26/03/2025 22:09:30",
            descricao = "Saida",
            valor = 1000.0,
            TipoMovimentacao.DESPESA,
            idCorrentista = 1)
        )

        dataSet.add(Movimentacao(
            id = 1,
            dataHora = "26/03/2025 22:09:30",
            descricao = "Saida",
            valor = 1000.0,
            TipoMovimentacao.DESPESA,
            idCorrentista = 1)
        )
        binding.rvBankStatement.adapter = BankStatementAdapter(dataSet)
    }
}