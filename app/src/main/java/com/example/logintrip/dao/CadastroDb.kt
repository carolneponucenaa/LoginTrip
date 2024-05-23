package com.example.logintrip.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.logintrip.model.Cadastro

@Database(entities = [Cadastro::class], version = 1)
abstract class CadastroDb(): RoomDatabase() {

    abstract fun contatoDao(): CadastroDao

    companion object{
        private lateinit var instancia: CadastroDb

        fun getBancoDeDados(context: Context): CadastroDb{
            instancia = Room
                .databaseBuilder(
                    context,
                    CadastroDb::class.java,
                    "db_cadastro"
                )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()

            return instancia
        }

    }

}
