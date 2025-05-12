package com.example.budgettracker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.budgettracker.database.AppDatabase
import com.example.budgettracker.model.Category
import kotlinx.coroutines.launch

class CategoryActivity : AppCompatActivity() {

    private lateinit var editTextCategoryName: EditText
    private lateinit var editTextCategoryDescription: EditText
    private lateinit var buttonAddCategory: Button
    private lateinit var listViewCategories: ListView
    private lateinit var categoryAdapter: CategoryAdapter // Custom adapter to display categories

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        editTextCategoryName = findViewById(R.id.editTextCategoryName)
        editTextCategoryDescription = findViewById(R.id.editTextCategoryDescription)
        buttonAddCategory = findViewById(R.id.buttonAddCategory)
        listViewCategories = findViewById(R.id.listViewCategories)

        buttonAddCategory.setOnClickListener {
            val categoryName = editTextCategoryName.text.toString()
            val categoryDescription = editTextCategoryDescription.text.toString()

            if (categoryName.isNotEmpty() && categoryDescription.isNotEmpty()) {
                val category = Category(name = categoryName, description = categoryDescription)
                lifecycleScope.launch {
                    AppDatabase.getDatabase(applicationContext).categoryDao().insertCategory(category)
                    loadCategories()
                }
            } else {
                Toast.makeText(this, "Please enter valid data", Toast.LENGTH_SHORT).show()
            }
        }

        loadCategories()
    }

    private fun loadCategories() {
        lifecycleScope.launch {
            val categories = AppDatabase.getDatabase(applicationContext).categoryDao().getAllCategories()
            categoryAdapter = CategoryAdapter(this@CategoryActivity, categories)
            listViewCategories.adapter = categoryAdapter
        }
    }
}
