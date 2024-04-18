package com.example.logintrip.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.logintrip.model.Viagens
import java.time.LocalDate

class ViagensRepository {
    @Composable
    fun listarTodasAsViagens(): List<Viagens>{
        val londres = Viagens(1,
            "LONDRES",
            "Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana.",
            dataChegada = LocalDate.of(2019, 2, 18),
            dataPartida = LocalDate.of(2019, 2, 21)
        )

        val paris= Viagens(2,
            "PARIS",
            "Paris, a capital da França, é uma importante cidade europeia e um centro mundial de arte, moda, gastronomia e cultura.",
            dataChegada = LocalDate.of(2020, 12, 13),
            dataPartida = LocalDate.of(2020, 12, 23)
        )
        val roma= Viagens(3,
            "ROMA",
            "Roma é a capital e a maior cidade de Itália.",
            dataChegada = LocalDate.of(2021, 8, 25),
            dataPartida = LocalDate.of(2021, 8, 30)

        )
        val bariloche= Viagens(4,
            "BARILOCHE",
            "San Carlos de Bariloche (comumente chamada de Bariloche) é uma cidade na região da Patagônia argentina. ",
            dataChegada = LocalDate.of(2022, 6, 1),
            dataPartida = LocalDate.of(2022, 6, 12)
        )
        val orlando= Viagens(5,
            "ORLANDO",
            "Orlando é uma cidade localizada no estado norte-americano da Flórida, no condado de Orange, do qual é sede.",
            dataChegada = LocalDate.of(2023, 4, 15),
            dataPartida = LocalDate.of(2023, 4, 29)
        )
        val cancun = Viagens(6,
            "CANCÚN",
            "Cancún, uma cidade mexicana situada na Península de Iucatã, na costa do Mar do Caribe, é conhecida por suas praias, seus vários resorts e sua vida noturna.",
            dataChegada = LocalDate.of(2019, 1, 1),
            dataPartida = LocalDate.of(2019, 1, 5)
        )

        val veneza= Viagens(7,
            "VENEZA",
            "Veneza, a capital da região de Vêneto, no norte da Itália, é formada por mais de 100 pequenas ilhas em uma lagoa no Mar Adriático",
            dataChegada = LocalDate.of(2020, 3, 25),
            dataPartida = LocalDate.of(2020, 3, 29)
        )
        val amsterda= Viagens(8,
            "AMSTERDÃ",
            "Amsterdã é a capital da Holanda, conhecida por seu patrimônio artístico, um elaborado sistema de canais e casas estreitas com telhados de duas águas, legados da era dourada do século XVII na cidade",
            dataChegada = LocalDate.of(2021, 5, 10),
            dataPartida = LocalDate.of(2021, 5, 17)

        )
        val puntacana= Viagens(9,
            "PUNTA CANA",
            "San Carlos de Bariloche (comumente chamada de Bariloche) é uma cidade na região da Patagônia argentina. ",
            dataChegada = LocalDate.of(2022, 7, 2),
            dataPartida = LocalDate.of(2022, 7, 12)
        )
        val dubai= Viagens(10,
            "DUBAI",
            "Orlando é uma cidade localizada no estado norte-americano da Flórida, no condado de Orange, do qual é sede.",
            dataChegada = LocalDate.of(2023, 9, 4),
            dataPartida = LocalDate.of(2023, 9, 6)
        )
        return listOf(londres,paris,roma,bariloche,orlando,cancun,dubai,puntacana,amsterda,veneza)
    }
}