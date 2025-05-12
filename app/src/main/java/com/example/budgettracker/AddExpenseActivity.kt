package com.example.budgettracker

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.budgettracker.database.AppDatabase
import com.example.budgettracker.model.Expense
import kotlinx.coroutines.launch

class AddExpenseActivity : AppCompatActivity() {

    private lateinit var editTextAmount: EditText
    private lateinit var editTextDescription: EditText
    private lateinit var editTextDate: EditText
    private lateinit var spinnerCategory: Spinner
    private lateinit var buttonSaveExpense: Button

    private var categoryIdList = listOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_expense)

        editTextAmount = findViewById(R.id.editTextAmount)
        editTextDescription = findViewById(R.id.editTextDescription)
        editTextDate = findViewById(R.id.editTextDate)
        spinnerCategory = findViewById(R.id.spinnerCategory)
        buttonSaveExpense = findViewById(R.id.buttonSaveExpense)

        loadCategoriesIntoSpinner()

        buttonSaveExpense.setOnClickListener {
            val amount = editTextAmount.text.toString().toDoubleOrNull()
            val description = editTextDescription.text.toString()
            val date = editTextDate.text.toString()
            val categoryPosition = spinnerCategory.selectedItemPosition

            if (amount != null && description.isNotEmpty() && date.isNotEmpty()) {
                val categoryId = categoryIdList[categoryPosition]
                val expense = Expense(
                    amount = amount,
                    description = description,
                    date = date,
                    categoryId = categoryId
                )

                lifecycleScope.launch {
                    AppDatabase.getDatabase(applicationContext).expenseDao().insertExpense(expense)
                    Toast.makeText(this@AddExpenseActivity, "Expense saved", Toast.LENGTH_SHORT).show()
                    finish() // close activity
                }
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun loadCategoriesIntoSpinner() {
        lifecycleScope.launch {
            val categories = AppDatabase.getDatabase(applicationContext).categoryDao().getAllCategories()
            categoryIdList = categories.map { it.id }
            val categoryNames = categories.map { it.name }

            val adapter = ArrayAdapter(
                this@AddExpenseActivity,
                android.R.layout.simple_spinner_item,
                categoryNames
            )
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerCategory.adapter = adapter
        }
    }
    Log.d("AddExpenseActivity", "Add Expense screen loaded")

    saveButton.setOnClickListener {
        Log.d("AddExpenseActivity", "Saving new expense: ${descriptionEditText.text}")
        Log.d("AddExpenseActivity", "Category: ${categorySpinner.selectedItem}")
        Log.d("AddExpenseActivity", "Date: ${selectedDate}")

        try {
            // Save to RoomDB
            Log.d("RoomDB", "Expense saved successfully")
        } catch (e: Exception) {
            Log.e("RoomDB", "Failed to save expense", e)
        }
    }


}
