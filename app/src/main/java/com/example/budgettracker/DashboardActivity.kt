package com.example.budgettracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val buttonAddCategory = findViewById<Button>(R.id.buttonGoToCategories)
        val buttonAddExpense = findViewById<Button>(R.id.buttonGoToAddExpense)
        val buttonViewExpenses = findViewById<Button>(R.id.buttonGoToViewExpenses)

        buttonAddCategory.setOnClickListener {
            startActivity(Intent(this, CategoryActivity::class.java))
        }

        buttonAddExpense.setOnClickListener {
            startActivity(Intent(this, AddExpenseActivity::class.java)) // Create later
        }

        buttonViewExpenses.setOnClickListener {
            startActivity(Intent(this, ViewExpensesActivity::class.java)) // Create later
        }
    }
}
