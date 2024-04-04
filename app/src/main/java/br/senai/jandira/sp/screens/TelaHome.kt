package br.senai.jandira.sp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
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
            Image(
                painter = painterResource(id = R.drawable.paisagem),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Text(
                    text = "Categories",
                    fontWeight = FontWeight.Light,
                    fontSize = 20.sp,
                    color = Color.Gray
                )
                LazyRow(modifier = Modifier.fillMaxWidth()){
                    items(2) {
                        Card (
                            modifier = Modifier
                                .padding(10.dp)
                                .height(100.dp)
                                .width(150.dp),
                            colors = CardDefaults
                                .cardColors(containerColor = Color.Magenta
                                )
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.montain),
                                contentDescription = "",
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                text = "Montain",
                                fontSize = 16.sp,
                                color = Color.White
                            )
                        }
                    }
                }

            Row (
                modifier = Modifier.width(350.dp),
                horizontalArrangement = Arrangement.Center
            ){
                OutlinedTextField(value = "",
                    onValueChange ={},
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.White,
                        unfocusedBorderColor = Color.White
                    ),
                    trailingIcon = {

                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(imageVector = Icons.Default.Search,
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
                items(2){
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
                                    painter = painterResource(id = R.drawable.paisagem),
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