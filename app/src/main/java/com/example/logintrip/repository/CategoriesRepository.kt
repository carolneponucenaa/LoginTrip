package com.example.logintrip.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.logintrip.R
import com.example.logintrip.model.Categories



class CategoriesRepository {
    @Composable
    fun listarTodasAsCategorias(): List<Categories> {
        val montain = Categories(
            1,
            "Montain",
            imagem = painterResource(id = R.drawable.mountain)
        )
        val snow = Categories(
            2,
            "Snow",
            imagem = painterResource(id = R.drawable.mountain)
        )
        val beach = Categories(
            3,
            "Beach",
            imagem = painterResource(id = R.drawable.mountain)
        )
        val roadtrip = Categories(
            4,
            "Road Trip",
            imagem = painterResource(id = R.drawable.mountain)
        )
        val historic = Categories(
            5,
            "Historic",
            imagem = painterResource(id = R.drawable.mountain)
        )
        return listOf(montain,snow,beach, roadtrip, historic)
    }
}