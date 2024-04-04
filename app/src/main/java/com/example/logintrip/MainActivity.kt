package com.example.logintrip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.jandira.sp.screens.TelaHome
import br.senai.jandira.sp.screens.TelaLogin
import br.senai.jandira.sp.screens.TelaSignUp
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
                    val controleDeNavegacao = rememberNavController()

                    NavHost(
                        navController = controleDeNavegacao,
                        startDestination = "login"
                    ){
                        composable(route = "login"){ TelaLogin(controleDeNavegacao) }
                        composable(route = "signUp"){ TelaSignUp(controleDeNavegacao) }
                        composable(route = "home"){ TelaHome() }
                    }
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginTripTheme {

    }
}



