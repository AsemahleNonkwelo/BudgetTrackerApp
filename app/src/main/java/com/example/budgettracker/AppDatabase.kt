package com.example.budgettracker.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.budgettracker.dao.CategoryDao
import com.example.budgettracker.dao.ExpenseDao
import com.example.budgettracker.model.Category
import com.example.budgettracker.model.Expense

@Database(entities = [Category::class, Expense::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun categoryDao(): CategoryDao
    abstract fun expenseDao(): ExpenseDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "budget_tracker_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}


