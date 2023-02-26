package com.abit8.counter

class Presenter {
    private val model = Ingector.getModel()
    private lateinit var counterView: CounterView

    fun plus() {
        model.plus()
        counterView.showNewCount(model.count)
        counterView.showToast(model.count)
        counterView.changeColor(model.count)

    }

    fun minus() {
        model.minus()
        counterView.showNewCount(model.count)
        counterView.showToast(model.count)
        counterView.changeColor(model.count)
    }

    fun fillCounterView(counterView: CounterView) {
        this.counterView = counterView
    }
}