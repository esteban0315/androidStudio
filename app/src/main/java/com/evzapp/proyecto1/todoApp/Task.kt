package com.evzapp.proyecto1.todoApp

data class Task(val name:String, val category: TaskCategory, var isSelected:Boolean = false) {
}