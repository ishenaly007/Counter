package com.abit8.counter

interface CounterView {
    fun showNewCount(count: Int)
    fun showToast(count: Int)
    fun changeColor(count: Int)
}