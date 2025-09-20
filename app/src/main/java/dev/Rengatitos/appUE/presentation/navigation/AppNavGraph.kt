package dev.Rengatitos.appUE.presentation.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.Rengatitos.appUE.presentation.auth.InitScreen
import dev.Rengatitos.appUE.presentation.auth.LoginScreen
import dev.Rengatitos.appUE.presentation.auth.RegisterScreen
import dev.Rengatitos.appUE.presentation.home.HomeScreen

@Composable
fun AppNavGraph (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Init") {
        composable("Register") { RegisterScreen(navController) }
        composable("Login") { LoginScreen(navController) }
        composable("Init") { InitScreen(navController) }
        composable("Home") { HomeScreen(navController) }
    }

}