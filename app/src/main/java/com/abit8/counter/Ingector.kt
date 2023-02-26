package com.abit8.counter

class Ingector {

    companion object{
        fun getPresenter():Presenter{
            return Presenter()
        }

        fun getModel():Model{
            return Model()
        }
    }
}