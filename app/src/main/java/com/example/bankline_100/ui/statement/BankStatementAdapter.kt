package com.example.bankline_100.ui.statement

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bankline_100.R
import com.example.bankline_100.databinding.BankStatementItemBinding
import com.example.bankline_100.domain.Movement
import com.example.bankline_100.domain.TypeMovement

class BankStatementAdapter(
    private val dataSet: List<Movement>,
) : RecyclerView.Adapter<BankStatementAdapter.ViewHolder>() {
    class ViewHolder(
        private val binding: BankStatementItemBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(item: Movement) =
            with(binding) {
                tvDescription.text = item.description
                tvValue.text = item.value.toString()
                tvDatetime.text = item.dateTime
                val typeIcon =
                    if (TypeMovement.REVENUE == item.type) R.drawable.ic_add_money else R.drawable.ic_remove
                ivIcon.setImageResource(typeIcon)
            }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ViewHolder {
        val binding =
            BankStatementItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        viewHolder: ViewHolder,
        position: Int,
    ) {
        val item = dataSet[position]
        viewHolder.bind(item)
    }

    override fun getItemCount() = dataSet.size
}
