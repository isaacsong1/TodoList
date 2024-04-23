package com.example.todolist

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter (
    private val todos: MutableList<Todo>
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
    class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) // TodoViewHolder class inherits RecyclerView with constructor itemView


}