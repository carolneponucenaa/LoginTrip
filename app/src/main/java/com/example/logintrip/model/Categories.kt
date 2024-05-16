package com.example.logintrip.model

import androidx.compose.ui.graphics.painter.Painter



data class Categories(
    var id: Int =0,
    var titulo:String="",
    var imagem: Painter? = null
)
