package com.example.motivacao.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.example.motivacao.R
import com.example.motivacao.infra.SecurityPreference
import com.example.motivacao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private var categoryId =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // esconder barra de nevagação
        supportActionBar?.hide()

        // Eventos
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Salvar nome por key
        var nome = SecurityPreference(applicationContext).getString("User_Name")
        binding.textUserName.text = "Ola!, $nome"

        binding.buttonNewPhrase.setOnClickListener(this)
        binding.imageIcAll.setOnClickListener(this)
        binding.imageIcEmoji.setOnClickListener(this)
        binding.imageIcSunny.setOnClickListener(this)


    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_new_phrase) {
            var s = ""
        }
        else if (view.id == R.id.image_ic_all) {
            binding.imageIcAll.setColorFilter(ContextCompat.getColor(applicationContext, R.color.white))
            binding.imageIcEmoji.setColorFilter(ContextCompat.getColor(applicationContext, R.color.dark_purple))
            binding.imageIcSunny.setColorFilter(ContextCompat.getColor(applicationContext, R.color.dark_purple))

            categoryId = 1
        }
        else if (view.id == R.id.image_ic_emoji){
            binding.imageIcAll.setColorFilter(ContextCompat.getColor(applicationContext, R.color.dark_purple))
            binding.imageIcEmoji.setColorFilter(ContextCompat.getColor(applicationContext, R.color.white))
            binding.imageIcSunny.setColorFilter(ContextCompat.getColor(applicationContext, R.color.dark_purple))

            categoryId = 2
        }
        else if(view.id == R.id.image_ic_sunny){
            binding.imageIcAll.setColorFilter(ContextCompat.getColor(applicationContext, R.color.dark_purple))
            binding.imageIcEmoji.setColorFilter(ContextCompat.getColor(applicationContext, R.color.dark_purple))
            binding.imageIcSunny.setColorFilter(ContextCompat.getColor(applicationContext, R.color.white))

            categoryId = 3
        }
    }
}