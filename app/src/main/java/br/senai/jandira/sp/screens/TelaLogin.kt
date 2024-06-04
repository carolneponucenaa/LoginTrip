package br.senai.jandira.sp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.logintrip.R
import com.example.logintrip.ui.theme.LoginTripTheme

@Composable
fun TelaLogin(controleDeNavegacao: NavHostController) {
    var emailState = remember {
        mutableStateOf("")
    }
    var senhaState = remember {
        mutableStateOf("")
    }
    var mensagemErroState = remember {
        mutableStateOf("")
    }
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
                    text = stringResource(id = R.string.login_in),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 60.sp,
                    color = Color.Magenta
                )
                Text(
                    text = stringResource(id = R.string.please_sign),
                    color = Color.Gray
                )
                OutlinedTextField(value = emailState.value,
                    onValueChange = {
                                    emailState.value = it
                    },
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
                            text = stringResource(id = R.string.email_new),
                            modifier = Modifier
                                .padding(
                                    start = 34.dp,
                                    top = 4.dp
                                )
                        )
                    }
                )
                OutlinedTextField(value = senhaState.value,
                    onValueChange = {
                                    senhaState.value = it
                    },
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
                            text = stringResource(id = R.string.password_new),
                            modifier = Modifier
                                .padding(
                                    start = 34.dp,
                                    top = 4.dp
                                )
                        )
                    },
                    visualTransformation = PasswordVisualTransformation()
                )
                Text(
                    text = mensagemErroState.value,
                    color = Color.Magenta,
                    fontWeight = FontWeight.Bold
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
                            onClick = {
                                if (emailState.value == "viajante" && senhaState.value == "1234"){
                                    mensagemErroState.value = ""
                                    controleDeNavegacao.navigate("home")
                                } else {
                                    mensagemErroState.value = "E-mail ou senha incorretos!"
                                }
                            },
                            modifier = Modifier
                                .width(150.dp)
                                .height(50.dp),
                            colors = ButtonDefaults.buttonColors(Color.Magenta)
                        ) {
                            Text(
                                text = stringResource(id = R.string.sign_in),
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 20.sp
                            )
                        }
                        Row(modifier = Modifier.padding(top = 10.dp)) {
                            Text(
                                text = stringResource(id = R.string.havent_account),
                                color = Color.Gray
                            )
                            Text(
                                text = stringResource(id = R.string.sign_up),
                                color = Color.Magenta,
                                fontWeight = FontWeight.ExtraBold,
                                modifier = Modifier.clickable {
                                    controleDeNavegacao.navigate("signUp")
                                }
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
@Preview(showSystemUi = true)
@Composable
fun TelaDeLoginPreview() {

    }



