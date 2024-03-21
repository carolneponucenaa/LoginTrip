package com.example.logintrip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.logintrip.ui.theme.LoginTripTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTripTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginTR()
                }
            }
        }
    }
}

@Composable
fun LoginTR(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.End,
    ) {
        Row(
            modifier = Modifier
                .width(150.dp)
                .height(60.dp)
                .background(
                    color = Color.Magenta,
                    shape = RoundedCornerShape(bottomStart = 25.dp)
                )
        ) {}
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 20.dp)
            ) {
                Text(
                    text = "Login",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 60.sp,
                    color = Color.Magenta
                )
                Text(
                    text = "Please sign in to continue",
                    color = Color.Gray
                )
                OutlinedTextField(value = "",
                    onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Magenta,
                        unfocusedBorderColor = Color.Magenta
                    ),
                    modifier = Modifier
                        .width(340.dp),
                    label = {
                        Image(
                            painterResource(id = R.drawable.email),
                            contentDescription = "Email",
                            modifier = Modifier
                                .width(30.dp)
                                .height(30.dp)
                        )
                        Text(
                            text = "Email",
                            modifier = Modifier
                                .padding(
                                    start = 34.dp,
                                    top = 4.dp
                                )
                        )
                    }
                )
                OutlinedTextField(value = "",
                    onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Magenta,
                        unfocusedBorderColor = Color.Magenta
                    ),
                    modifier = Modifier
                        .width(340.dp)
                        .padding(top = 10.dp),
                    label = {
                        Image(
                            painterResource(id = R.drawable.senha),
                            contentDescription = "Senha",
                            modifier = Modifier
                                .width(30.dp)
                                .height(30.dp)
                        )
                        Text(
                            text = "Senha",
                            modifier = Modifier
                                .padding(
                                    start = 34.dp,
                                    top = 4.dp
                                )
                        )
                    }
                )
                Row(
                    modifier = Modifier
                        .width(400.dp)
                        .padding(top = 20.dp, end = 50.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Column(
                        horizontalAlignment = Alignment.End
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .width(150.dp)
                                .height(50.dp),
                            colors = ButtonDefaults.buttonColors(Color.Magenta)
                        ) {
                            Text(
                                text = "SIGN IN",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 20.sp
                            )
                        }
                        Row(modifier = Modifier.padding(top = 10.dp)) {
                            Text(
                                text = "Don't have an account?",
                                color = Color.Gray
                            )
                            Text(
                                text = "Sing up",
                                color = Color.Magenta,
                                fontWeight = FontWeight.ExtraBold
                            )
                        }
                    }
                }
            }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ){
        Row(
            modifier = Modifier
                .width(150.dp)
                .height(60.dp)
                .background(
                    color = Color.Magenta,
                    shape = RoundedCornerShape(topEnd = 30.dp)
                ),
            verticalAlignment = Alignment.Bottom
        ){}
    }
}

@Composable
fun SignUpTR(){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.End,
    ) {
        Row(
            modifier = Modifier
                .width(150.dp)
                .height(60.dp)
                .background(
                    color = Color.Magenta,
                    shape = RoundedCornerShape(bottomStart = 25.dp)
                )
        ) {}
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Sign Up",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 40.sp,
                    color = Color.Magenta
                )
                Text(
                    text = "Create a new account",
                    color = Color.Gray
                )
                Box(modifier = Modifier
                    .padding(top = 20.dp)
                    .width(100.dp)
                    .height(100.dp)
                    .background(
                        color= Color.Gray,
                        shape = RoundedCornerShape(100.dp)
                    )
                ){
                        Image(painter = painterResource(id =R.drawable.profile ),
                            contentDescription ="profile",
                            modifier = Modifier
                                .padding(top = 15.dp, start = 15.dp)
                                .height(70.dp)
                                .width(70.dp)
                        )
                }
                OutlinedTextField(value = "",
                    onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Magenta,
                        unfocusedBorderColor = Color.Magenta
                    ),
                    modifier = Modifier
                        .width(340.dp),
                    label = {
                        Image(
                            painterResource(id = R.drawable.username),
                            contentDescription = "Username",
                            modifier = Modifier
                                .width(30.dp)
                                .height(30.dp)
                        )
                        Text(
                            text = "Username",
                            modifier = Modifier
                                .padding(
                                    start = 34.dp,
                                    top = 4.dp
                                )
                        )
                    }
                )
                OutlinedTextField(value = "",
                    onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Magenta,
                        unfocusedBorderColor = Color.Magenta
                    ),
                    modifier = Modifier
                        .width(340.dp)
                        .padding(top = 10.dp),
                    label = {
                        Image(
                            painterResource(id = R.drawable.phone),
                            contentDescription = "Phone",
                            modifier = Modifier
                                .width(30.dp)
                                .height(30.dp)
                        )
                        Text(
                            text = "Phone",
                            modifier = Modifier
                                .padding(
                                    start = 34.dp,
                                    top = 4.dp
                                )
                        )
                    }
                )
                OutlinedTextField(value = "",
                    onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Magenta,
                        unfocusedBorderColor = Color.Magenta
                    ),
                    modifier = Modifier
                        .width(340.dp)
                        .padding(top = 10.dp),
                    label = {
                        Image(
                            painterResource(id = R.drawable.email),
                            contentDescription = "Email",
                            modifier = Modifier
                                .width(30.dp)
                                .height(30.dp)
                        )
                        Text(
                            text = "Email",
                            modifier = Modifier
                                .padding(
                                    start = 34.dp,
                                    top = 4.dp
                                )
                        )
                    }
                )
                OutlinedTextField(value = "",
                    onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Magenta,
                        unfocusedBorderColor = Color.Magenta
                    ),
                    modifier = Modifier
                        .width(340.dp)
                        .padding(top = 10.dp),
                    label = {
                        Image(
                            painterResource(id = R.drawable.senha),
                            contentDescription = "Senha",
                            modifier = Modifier
                                .width(30.dp)
                                .height(30.dp)
                        )
                        Text(
                            text = "Senha",
                            modifier = Modifier
                                .padding(
                                    start = 34.dp,
                                    top = 4.dp
                                )
                        )
                    }
                )
                Row(
                    modifier = Modifier
                        .width(400.dp)
                        .padding(top = 20.dp, end = 50.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Column(
                        horizontalAlignment = Alignment.End
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .width(300.dp)
                                .height(50.dp),
                            colors = ButtonDefaults.buttonColors(Color.Magenta)
                        ) {
                            Text(
                                text = "CREATE ACCOUNT",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 20.sp
                            )
                        }
                        Row(modifier = Modifier.padding(top = 10.dp)) {
                            Text(
                                text = "Already have an account?",
                                color = Color.Gray
                            )
                            Text(
                                text = "Sing in",
                                color = Color.Magenta,
                                fontWeight = FontWeight.ExtraBold
                            )
                        }
                    }
                }
            }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ){
        Row(
            modifier = Modifier
                .width(150.dp)
                .height(60.dp)
                .background(
                    color = Color.Magenta,
                    shape = RoundedCornerShape(topEnd = 30.dp)
                ),
            verticalAlignment = Alignment.Bottom
        ){}
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LoginTripTheme {
        LoginTR()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpPreview(){
    LoginTripTheme {
        SignUpTR()
    }
}