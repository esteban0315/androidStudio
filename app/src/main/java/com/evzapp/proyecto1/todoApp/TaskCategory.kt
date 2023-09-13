package com.evzapp.proyecto1.todoApp

sealed class TaskCategory(var isSelected:Boolean = true) {
    object Personal: TaskCategory()
    object Business: TaskCategory()
    object Other: TaskCategory()
}