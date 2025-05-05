package com.example.odev5

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val numbers = ArrayList<Int>()
    var question = ""
    var screen = ""

    fun write(sayi: Int){

        if(screen == "0" && sayi == 0){
            return
        }
        question += sayi.toString()
        screen += sayi.toString()
        binding.twEkran.text = screen
    }

    fun add(){
        if(screen == ""){
            return
        }
        if(screen[screen.length - 1].toString() == "+"){
            return
        }
        numbers.add(question.toInt())
        question = ""
        screen += "+"
        binding.twEkran.text = screen
    }

    fun calculate(){
        if(screen == "" || screen[screen.length - 1].toString() == "+"){
            return
        }
        numbers.add(question.toInt())
        question = ""
        var result = 0
        for(i in numbers){
            result += i
        }
        question = result.toString()
        screen = result.toString()
        numbers.clear()
        binding.twEkran.text = screen
    }

    fun clear(){
        screen = ""
        question = ""
        numbers.clear()
        binding.twEkran.text = screen
    }

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAC.setOnClickListener {
            clear()
        }

        binding.buttonArti.setOnClickListener {
            add()
        }

        binding.buttonEsittir.setOnClickListener {
            calculate()
        }

        binding.buttonSayi0.setOnClickListener {
            write(sayi = 0)
        }

        binding.buttonSayi1.setOnClickListener {
            write(sayi = 1)
        }

        binding.buttonSayi2.setOnClickListener {
            write(sayi = 2)
        }

        binding.buttonSayi3.setOnClickListener {
            write(sayi = 3)
        }

        binding.buttonSayi4.setOnClickListener {
            write(sayi = 4)
        }

        binding.buttonSayi5.setOnClickListener {
            write(sayi = 5)
        }

        binding.buttonSayi6.setOnClickListener {
            write(sayi = 6)
        }

        binding.buttonSayi7.setOnClickListener {
            write(sayi = 7)
        }

        binding.buttonSayi8.setOnClickListener {
            write(sayi = 8)
        }

        binding.buttonSayi9.setOnClickListener {
            write(sayi = 9)
        }
    }
}