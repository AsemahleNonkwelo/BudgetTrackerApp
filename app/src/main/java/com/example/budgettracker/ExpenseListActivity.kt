package com.example.budgettracker

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.budgettracker.database.AppDatabase
import kotlinx.coroutines.launch

class ExpenseListActivity : AppCompatActivity() {

    private lateinit var listViewExpenses: ListView
    private lateinit var expenseAdapter: ExpenseAdapter // You'll create this next

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expense_list)

        listViewExpenses = findViewById(R.id.listViewExpenses)

        loadExpenses()
    }

    private fun loadExpenses() {
        lifecycleScope.launch {
            val expenses = AppDatabase.getDatabase(applicationContext).expenseDao().getAllExpenses()
            expenseAdapter = ExpenseAdapter(this@ExpenseListActivity, expenses)
            listViewExpenses.adapter = expenseAdapter
        }
    }
}
