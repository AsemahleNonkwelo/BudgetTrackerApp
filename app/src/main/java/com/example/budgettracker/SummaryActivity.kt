package com.example.budgettracker

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.budgettracker.database.AppDatabase
import kotlinx.coroutines.launch

class SummaryActivity : AppCompatActivity() {

    private lateinit var listViewSummary: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)

        listViewSummary = findViewById(R.id.listViewSummary)

        lifecycleScope.launch {
            val summaries = AppDatabase.getDatabase(applicationContext).expenseDao().getCategorySummaries()
            val summaryText = summaries.map { "${it.category}: R${"%.2f".format(it.total)}" }

            val adapter = ArrayAdapter(this@SummaryActivity, android.R.layout.simple_list_item_1, summaryText)
            listViewSummary.adapter = adapter
        }
    }
}
