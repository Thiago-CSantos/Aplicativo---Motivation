package com.example.motivacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.motivacao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // esconder barra de nevagação
        supportActionBar?.hide()

        // Eventos
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNewPhrase.setOnClickListener(this)

    }

    override fun onClick(botao: View) {
        if (botao.id == R.id.button_new_phrase){
        var s = ""
        }
    }
}