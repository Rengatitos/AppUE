package dev.Rengatitos.appUE.presentation.auth


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun InitScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
    ) {
        Text(text = "Inicio")
        Button(
            onClick = {

                navController.navigate("Register") // La ruta para RegisterScree
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Register")
        }
        Button(
            onClick = {

                navController.navigate("Login")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Login")
        }

    }
}