package com.example.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter (
    private val todos: MutableList<Todo>
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
    class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) // TodoViewHolder class inherits RecyclerView with constructor itemView

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        // Creates a TodoViewHolder and returns it
        return TodoViewHolder (
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_todo,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        // Binds data from todos list to the views of our list
        val currTodo = todos[position]
        holder.itemView.apply {
            
        }
    }

    override fun getItemCount(): Int {
        // Returns the number of items in our list
        return todos.size
    }
}