package dev.Rengatitos.appUE.presentation.auth
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun LoginScreen(navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column (
        modifier = Modifier.padding(16.dp)
    ){
        Text("Iniciar Sesión", style = MaterialTheme.typography.titleLarge)

        Text("correo electronico")
        OutlinedTextField(
            value = email,
            onValueChange = {email=it},
            label = {Text("Correo Electronico")},
            placeholder = {Text("Correo Electronico")},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = password,
            onValueChange = {password=it},
            label = {Text("Contraseña")},
            placeholder = {Text("Contraseña")},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            if(email.isNotEmpty() && password.isNotEmpty()) {
                navController.navigate("Home")
            }
        },modifier = Modifier.fillMaxWidth()
            ) {
            Text("Iniciar Sesión")

        }


    }
}


