package com.example.motivacao.infra

import android.content.Context
import android.content.SharedPreferences

class SecurityPreference(s: Context) {
    private var securityNome: SharedPreferences =
        s.getSharedPreferences("ABC", Context.MODE_PRIVATE)

    fun storeString(key:String, value:String) {
        securityNome.edit().putString(key, value).apply()
    }

    fun getString(key:String): String? {
        return securityNome.getString(key, "")

    }

}