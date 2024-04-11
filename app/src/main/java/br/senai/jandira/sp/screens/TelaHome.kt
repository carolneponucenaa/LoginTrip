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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.logintrip.R
import com.example.logintrip.ui.theme.LoginTripTheme

@Composable
fun TelaHome(){
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
                    Text(text = "YOU'RE IN PARIS",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = FontFamily.SansSerif
                    )
                }
                Box(modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.BottomStart)){
                    Text(text = "My Trips",
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
                    text = "Categories",
                    fontWeight = FontWeight.Light,
                    fontSize = 20.sp,
                    color = Color.Gray
                )
                LazyRow(modifier = Modifier.fillMaxWidth()){
                    items(3) {
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
                                    painter = painterResource(id = R.drawable.mountain),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                                Text(
                                    text = "Mountain",
                                    fontSize = 16.sp,
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold
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
                            text ="Search your destiny",
                            color = Color.Gray)
                    }
                )
            }

            Text(
                text = "Past Trips",
                fontWeight = FontWeight.Light,
                fontSize = 20.sp,
                color = Color.Gray
            )
            }
            LazyColumn (
                modifier = Modifier.fillMaxSize()
            ) {
                items(3){
                    Card (
                        modifier = Modifier
                            .padding(10.dp)
                            .height(150.dp)
                            .width(400.dp),
                        colors = CardDefaults
                            .cardColors(containerColor = Color.White
                            )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceBetween
                        ){
                            Card(
                                modifier = Modifier
                                    .height(70.dp)
                                    .width(360.dp)
                                    .padding(top = 3.dp, start = 0.dp, end = 0.dp, bottom = 0.dp)
                            )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.londres),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Column (
                                modifier = Modifier.padding(start = 16.dp)
                            ){
                                Text(
                                    text = "London, 2019",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = Color.Magenta
                                )
                                Text(
                                    text = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
                                    fontSize = 12.sp,
                                    color = Color.Gray
                                )
                            }
                                Row(
                                    modifier = Modifier.width(350.dp),
                                    horizontalArrangement = Arrangement.End,
                                    verticalAlignment = Alignment.Bottom
                                ){
                                    Text(
                                        text = "18 Feb - 21 Feb",
                                        fontSize = 12.sp,
                                        color = Color.Magenta,
                                        fontWeight = FontWeight.Bold
                                    )
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