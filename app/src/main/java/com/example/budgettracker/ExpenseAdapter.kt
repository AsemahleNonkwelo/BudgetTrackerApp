package com.example.budgettracker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.budgettracker.model.Expense

class ExpenseAdapter(private val context: Context, private val expenseList: List<Expense>) : BaseAdapter() {

    override fun getCount(): Int = expenseList.size

    override fun getItem(position: Int): Any = expenseList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_expense, parent, false)

        val expense = expenseList[position]

        val textViewName = view.findViewById<TextView>(R.id.textViewExpenseName)
        val textViewAmount = view.findViewById<TextView>(R.id.textViewExpenseAmount)
        val textViewCategory = view.findViewById<TextView>(R.id.textViewExpenseCategory)

        textViewName.text = expense.name
        textViewAmount.text = "R${expense.amount}"
        textViewCategory.text = "Category: ${expense.categoryName}"

        return view
    }
}
