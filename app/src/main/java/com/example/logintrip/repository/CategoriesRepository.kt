package com.example.logintrip.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.logintrip.R
import com.example.logintrip.model.Categories



class CategoriesRepository {
    @Composable
    fun listarTodasAsCategorias(): List<Categories> {
        val montain = Categories(
            1,
            stringResource(id = R.string.categories_mountain),
            imagem = painterResource(id = R.drawable.montanhas)
        )
        val snow = Categories(
            2,
            stringResource(id = R.string.categories_snow),
            imagem = painterResource(id = R.drawable.esquiar)
        )
        val beach = Categories(
            3,
            stringResource(id = R.string.categories_beach),
            imagem = painterResource(id = R.drawable.beach)
        )
        val roadtrip = Categories(
            4,
            stringResource(id = R.string.categories_road),
            imagem = painterResource(id = R.drawable.kombi)
        )
        val historic = Categories(
            5,
            stringResource(id = R.string.categories_historic),
            imagem = painterResource(id = R.drawable.historia)
        )
        val nature = Categories(
            6,
            stringResource(id = R.string.categories_nature),
            imagem = painterResource(id = R.drawable.natureza)
        )
        val city = Categories(
            7,
            stringResource(id = R.string.categories_city),
            imagem = painterResource(id = R.drawable.cidade)
        )
        val island = Categories(
            8,
            stringResource(id = R.string.categories_island),
            imagem = painterResource(id = R.drawable.ilha)
        )
        return listOf(montain,snow,beach, roadtrip, historic,nature,city,island)
    }
}