package com.example.loginapp.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.loginapp.components.Contact

@Composable
fun MainScreen(navController: NavHostController) {

    var name by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }


    val contactos = listOf(
        Pair("Angel", "612531237"),
        Pair("Diego", "612531890"),
        Pair("Angel", "612531237"),
        Pair("Diego", "612531890"),
        Pair("Angel", "612531237"),
        Pair("Diego", "612531890"),
        Pair("Angel", "612531237"),
        Pair("Diego", "612531890"),
    )

    // Usamos una Column para que la lista y el formulario no se encimen
    Column(modifier = Modifier.fillMaxSize()) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Gray)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                TextField(
                    value = name,
                    onValueChange = {name = it},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                        .border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(12.dp)),
                    shape = RoundedCornerShape(12.dp),
                    placeholder = { Text(text = "Nombre") }
                )
                TextField(
                    value = phone,
                    onValueChange = {phone = it},
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(BorderStroke(width = 1.dp, color = Color.Gray), RoundedCornerShape(12.dp)),
                    shape = RoundedCornerShape(12.dp),
                    placeholder = { Text(text = "Teléfono") }
                )

                Button(
                    onClick = {
                        // Acción al hacer clic en el botón
                    },
                    modifier = Modifier.padding(top = 16.dp)
                        .border(BorderStroke(1.dp, Color.Gray) , RoundedCornerShape(12.dp)),
                    shape = RoundedCornerShape(12.dp),
                    colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                        containerColor = Color(81, 78, 184)
                    )
                ) {
                    Text(text = "Agregar Contacto")
                }
                Button(
                    onClick = {
                        name = ""
                        phone = ""
                    },
                    modifier = Modifier.padding(top = 16.dp)
                        .border(BorderStroke(1.dp, Color.Gray) , RoundedCornerShape(12.dp)),
                    shape = RoundedCornerShape(12.dp),
                    colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray
                    )
                ) {
                    Text(text = "Borrar")
                }
            }
        }

        LazyColumn(modifier = Modifier.weight(1f)) {
            items(items = contactos) { contact ->
                Contact(name = contact.first, phone = contact.second)
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MainScreenPreview() {
    val navController = rememberNavController()
    MainScreen(navController)
}
