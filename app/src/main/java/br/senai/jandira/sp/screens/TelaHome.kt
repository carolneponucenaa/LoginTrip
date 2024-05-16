package br.senai.jandira.sp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.logintrip.R
import com.example.logintrip.repository.CategoriesRepository
import com.example.logintrip.repository.ViagensRepository
import com.example.logintrip.ui.theme.LoginTripTheme
import com.example.logintrip.utils.encurtarData

@Composable
fun TelaHome(){
    val viagem = ViagensRepository().listarTodasAsViagens()
    val categoria = CategoriesRepository().listarTodasAsCategorias()
    Column (
        modifier = Modifier
            .background(Color(0xFFEAEAF0))
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            shape = RectangleShape
        )
        {
            Box(modifier = Modifier.fillMaxSize()){
                Image(
                    painter = painterResource(id = R.drawable.paisagem),
                    contentDescription = "",
                    contentScale = ContentScale.Crop
                )
                Row(modifier = Modifier
                    .padding(bottom = 50.dp)
                    .align(Alignment.BottomStart)
                ){
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = "Botao de Busca",
                        tint = Color.White
                    )
                    Text(text = stringResource(id = R.string.where_name),
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = FontFamily.SansSerif
                    )
                }
                Box(modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.BottomStart)){
                    Text(text = stringResource(id = R.string.title_trips),
                        color = Color.White,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )
                }
                Box(modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.TopEnd)){
                    Card(
                        modifier = Modifier
                            .size(90.dp),
                        shape = CircleShape
                    ){
                        Image(painter = painterResource(id = R.drawable.mulher),
                            contentDescription = "Foto de Perfil",
                            contentScale = ContentScale.Crop,
                            )
                    }
                        Column (
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Spacer(modifier = Modifier.height(85.dp))
                            Text(
                                text = "Susanna Hoffs",
                                color = Color.White,
                                fontWeight = FontWeight.Light)
                        }
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 3.dp)
                    .fillMaxWidth(),
            ) {
                Text(
                    text = stringResource(id = R.string.categories_trips),
                    fontWeight = FontWeight.Light,
                    fontSize = 20.sp,
                    color = Color.Gray
                )
                LazyRow(modifier = Modifier.fillMaxWidth()){
                    items(categoria) {
                        Card (
                            modifier = Modifier
                                .padding(10.dp)
                                .height(100.dp)
                                .width(150.dp),
                            colors = CardDefaults
                                .cardColors(containerColor = Color.Magenta
                                )
                        ){
                            Column (
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ){
                                Image(
                                    painter = it.imagem!!,
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                                Text(
                                    text = it.titulo,
                                    fontSize = 16.sp,
                                    color = Color.White,
                                    fontWeight = FontWeight.Medium
                                )
                            }

                        }
                    }
                }

            Row (
                modifier = Modifier
                    .width(350.dp)
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.Center
            ){
                OutlinedTextField(value = "",
                    onValueChange ={},
                    modifier = Modifier
                        .background(Color.White, RoundedCornerShape(30))
                        .fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.White,
                        unfocusedBorderColor = Color.White
                    ),
                    trailingIcon = {

                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "Botao de Busca",
                                tint = Color.Gray
                            )

                        }
                    },
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.search_trips),
                            color = Color.Gray)
                    }
                )
            }

            Text(
                text = stringResource(id = R.string.past_trips),
                fontWeight = FontWeight.Light,
                fontSize = 20.sp,
                color = Color.Gray
            )
            }
            LazyColumn {
                items(viagem){
                    Card (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 4.dp),
                        colors = CardDefaults
                            .cardColors(containerColor = Color.White)
                    ){
                        Column(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Surface(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp)
                            ) {
                                Image(
                                    painter = if(it.imagem == null) painterResource(id = R.drawable.semimagem) else it.imagem!!,
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop)
                            }
                            Column (
                                modifier = Modifier.padding(8.dp)
                            ){
                                Row(
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 12.dp)
                                ) {
                                    Row (
                                        verticalAlignment = Alignment.CenterVertically
                                    ){
                                        Text(text = "${it.destino},${it.dataChegada.year}",
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = Color.Magenta
                                        )
                                    }
                                }
                                Text(text = it.descricao,
                                    fontSize = 12.sp,
                                    color = Color.Gray
                                )
                                Row(
                                    horizontalArrangement = Arrangement.End,
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 10.dp)

                                ) {
                                    Row {
                                        Text(text = "${encurtarData (it.dataChegada)} - ${encurtarData(it.dataPartida)}",
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = Color.Magenta
                                        )

                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TripsPreview() {
    LoginTripTheme {
        TelaHome()
    }
}