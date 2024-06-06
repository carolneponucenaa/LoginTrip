package com.example.logintrip.repository

import android.content.Context
import android.provider.ContactsContract.CommonDataKinds.Email
import com.example.logintrip.dao.CadastroDb
import com.example.logintrip.model.Cadastro

class CadastroRepository (context: Context){

       private val db = CadastroDb.getBancoDeDados(context).contatoDao()

        fun salvar (contato: Cadastro):Long{
            return db.salvar(contato)
       }
    fun validaLogin (email: String, senha: String): Boolean {
        return db.logar(email, senha)
    }
        fun listarTodosOsCadastros(): List<Cadastro>{
           return db.listarTodosOsCadastros()
        }
    }
