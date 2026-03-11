package com.example.loginapp.navigation

import WelcomeScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginapp.screens.LoginScreen
import com.example.loginapp.screens.SignUpScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "welcome"
    ){
        composable("welcome") {
            WelcomeScreen(navController)
        }
        composable("login"){
            LoginScreen(navController)
        }
        composable("sign-up"){
            SignUpScreen(navController)
        }

    }
}