package com.example.motivacao.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.motivacao.R
import com.example.motivacao.infra.SecurityPreference
import com.example.motivacao.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.buttonSalvar.setOnClickListener(this)

        vereficarNomeUsusario()
    }

    private fun vereficarNomeUsusario(){
        var nome = SecurityPreference(applicationContext).getString("User_Name")
        if(nome != ""){
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        }
    }

    override fun onClick(botao: View) {
        if (botao.id == R.id.button_salvar) {
            salvarNome()
        }
    }

    private fun salvarNome(): Unit {
        var nome = binding.editNome.text.toString()

        if (nome != "") {
            SecurityPreference(applicationContext).storeString("User_Name", nome)
            startActivity(Intent(applicationContext, MainActivity::class.java))
            //finish destroi a tela anterior inpedindo de voltar nela
            finish()
        } else {
            Toast.makeText(applicationContext, "Deve informar o nome!", Toast.LENGTH_LONG).show()
        }
    }

}