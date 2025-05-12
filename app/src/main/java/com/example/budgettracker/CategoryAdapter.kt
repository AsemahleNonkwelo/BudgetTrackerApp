package com.example.budgettracker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.budgettracker.model.Category

class CategoryAdapter(context: Context, categories: List<Category>) :
    ArrayAdapter<Category>(context, 0, categories) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val category = getItem(position)
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_category, parent, false)

        val nameTextView = view.findViewById<TextView>(R.id.textViewCategoryName)
        val descriptionTextView = view.findViewById<TextView>(R.id.textViewCategoryDescription)

        nameTextView.text = category?.name
        descriptionTextView.text = category?.description

        return view
    }
}
