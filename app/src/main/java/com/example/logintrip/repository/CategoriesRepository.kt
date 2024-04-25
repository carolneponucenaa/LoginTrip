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
            imagem = painterResource(id = R.drawable.montanhas)
        )
        val snow = Categories(
            2,
            "Snow",
            imagem = painterResource(id = R.drawable.esquiar)
        )
        val beach = Categories(
            3,
            "Beach",
            imagem = painterResource(id = R.drawable.beach)
        )
        val roadtrip = Categories(
            4,
            "Road Trip",
            imagem = painterResource(id = R.drawable.kombi)
        )
        val historic = Categories(
            5,
            "Historic",
            imagem = painterResource(id = R.drawable.historia)
        )
        val nature = Categories(
            6,
            "Nature",
            imagem = painterResource(id = R.drawable.natureza)
        )
        val city = Categories(
            7,
            "City",
            imagem = painterResource(id = R.drawable.cidade)
        )
        val island = Categories(
            8,
            "Island",
            imagem = painterResource(id = R.drawable.ilha)
        )
        return listOf(montain,snow,beach, roadtrip, historic,nature,city,island)
    }
}