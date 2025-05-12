package com.example.budgettracker.dao

import androidx.room.*
import com.example.budgettracker.model.Expense

@Dao
interface ExpenseDao {

    @Insert
    suspend fun insertExpense(expense: Expense)

    @Query("SELECT * FROM expenses ORDER BY date DESC")
    suspend fun getAllExpenses(): List<Expense>

    @Query("SELECT * FROM expenses WHERE categoryId = :categoryId")
    suspend fun getExpensesByCategory(categoryId: Int): List<Expense>

    @Delete
    suspend fun deleteExpense(expense: Expense)


}
