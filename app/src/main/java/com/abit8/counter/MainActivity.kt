package com.abit8.counter

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.abit8.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = Ingector.getPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.fillCounterView(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            btnPlus.setOnClickListener {
                /*tvNum.text = count++.toString()*/
                presenter.plus()
            }
            btnMinus.setOnClickListener {
                presenter.minus()
            }
        }
    }

    override fun showNewCount(count: Int) {
        binding.tvNum.text = count.toString()
    }

    override fun showToast(count: Int) {
        if (count == 10){
            Toast.makeText(applicationContext,"Поздравляем!!",Toast.LENGTH_SHORT).show()
        }
    }

    override fun changeColor(count: Int) {
        if (count == 15){
            binding.tvNum.setTextColor(Color.GREEN)
        }else{
            binding.tvNum.setTextColor(Color.BLACK)
        }

    }

}