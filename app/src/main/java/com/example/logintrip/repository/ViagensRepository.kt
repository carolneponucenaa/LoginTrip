package com.example.logintrip.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.logintrip.R
import com.example.logintrip.model.Viagens
import java.time.LocalDate

class ViagensRepository {
    @Composable
    fun listarTodasAsViagens(): List<Viagens>{
        val londres = Viagens(1,
            stringResource(id = R.string.london_name),
            stringResource(id = R.string.descricao_london),
            dataChegada = LocalDate.of(2019, 2, 18),
            dataPartida = LocalDate.of(2019, 2, 21),
            imagem = painterResource(id = R.drawable.londres)
        )

        val santorini= Viagens(2,
            stringResource(id = R.string.santorini_name),
            stringResource(id = R.string.descricao_santorini),
            dataChegada = LocalDate.of(2020, 12, 13),
            dataPartida = LocalDate.of(2020, 12, 23),
            imagem = painterResource(id = R.drawable.santorini)
        )
        val roma= Viagens(3,
            stringResource(id = R.string.rome_name),
            stringResource(id = R.string.descricao_roma),
            dataChegada = LocalDate.of(2021, 8, 25),
            dataPartida = LocalDate.of(2021, 8, 30),
            imagem = painterResource(id = R.drawable.roma)

        )
        val bariloche= Viagens(4,
            stringResource(id = R.string.bariloche_name),
            stringResource(id = R.string.descricao_bariloche),
            dataChegada = LocalDate.of(2022, 6, 1),
            dataPartida = LocalDate.of(2022, 6, 12),
            imagem = painterResource(id = R.drawable.bariloche)
        )
        val orlando= Viagens(5,
            stringResource(id = R.string.orlando_name),
            stringResource(id = R.string.descricao_orlando),
            dataChegada = LocalDate.of(2023, 4, 15),
            dataPartida = LocalDate.of(2023, 4, 29),
            imagem = painterResource(id = R.drawable.orlando)
        )
        val cancun = Viagens(6,
            stringResource(id = R.string.cancun_name),
            stringResource(id = R.string.descricao_cancun),
            dataChegada = LocalDate.of(2019, 1, 1),
            dataPartida = LocalDate.of(2019, 1, 5),
            imagem = painterResource(id = R.drawable.cancun)
        )

        val veneza= Viagens(7,
            stringResource(id = R.string.venice_name),
            stringResource(id = R.string.descricao_veneza),
            dataChegada = LocalDate.of(2020, 3, 25),
            dataPartida = LocalDate.of(2020, 3, 29),
            imagem = painterResource(id = R.drawable.veneza)
        )
        val amsterda= Viagens(8,
            stringResource(id = R.string.amsterdam_name),
            stringResource(id = R.string.descricao_amsterda),
            dataChegada = LocalDate.of(2021, 5, 10),
            dataPartida = LocalDate.of(2021, 5, 17),
            imagem = painterResource(id = R.drawable.amsterda)

        )
        val puntacana= Viagens(9,
            stringResource(id = R.string.punta_name),
            stringResource(id = R.string.descricao_punta),
            dataChegada = LocalDate.of(2022, 7, 2),
            dataPartida = LocalDate.of(2022, 7, 12),
            imagem = painterResource(id = R.drawable.puntacana)
        )
        val dubai= Viagens(10,
            stringResource(id = R.string.dubai_name),
            stringResource(id = R.string.descricao_dubai),
            dataChegada = LocalDate.of(2023, 9, 4),
            dataPartida = LocalDate.of(2023, 9, 6),
            imagem = painterResource(id = R.drawable.dubai)
        )
        return listOf(londres,santorini,roma,bariloche,orlando,cancun,dubai,puntacana,amsterda,veneza)
    }
}