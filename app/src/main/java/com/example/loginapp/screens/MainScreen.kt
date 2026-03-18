package com.example.loginapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.loginapp.components.Contact
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max


@Composable
fun MainScreen(navController: NavHostController) {
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
    val contactList = remember{mutableStateListOf<Pair<String, String>>()}

   LazyColumn {
        items(items = contactos) {
            contact ->
            Contact(name = contact.first, phone = contact.second)

        }
    }
    Box(
        modifier = Modifier
            .background(Color.Gray)
            .widthIn(max(200.dp))
    ){
        Text(
            text = "Nuevo Contacto"
        )
    }
}
@Composable
@Preview (showBackground = true)
fun MainScreenPreview(){
    val navController = rememberNavController()

    MainScreen(navController)
}