package com.example.logintrip.model

import androidx.compose.ui.graphics.painter.Painter
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate


@Entity(tableName = "tbl_cadastro")
data class Cadastro(
    @PrimaryKey(autoGenerate = true)
    var id: Long =0,

    var nome: String = "",
    var telefone: String = "",
    var email: String = "",
    var senha: String = "",


    @ColumnInfo(name = "over_eighteen")
    var overEighteen: Boolean = false
)

