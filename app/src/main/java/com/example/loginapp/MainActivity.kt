package com.example.loginapp

import android.R.attr.button
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            LoginScreen()
        }
    }
}
@Composable
@Preview
fun LoginScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF5B4FCF))
            .padding(24.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White, shape = RoundedCornerShape(40.dp))
                .padding(24.dp)
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.imagen),
                contentDescription = null,
                modifier = Modifier
                    .height(400.dp)
                    .width(400.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Hello",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Welcome To Little Drop, where\nyou manage you daily tasks",
                fontSize = 14.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(32.dp))

            Box(
                modifier = Modifier
                    .background(Color(81, 78, 184), shape = RoundedCornerShape(40.dp))
                    .height(40.dp)
                    .width(200.dp)
            ){
                Text(
                    text = "Login",
                    fontSize = 14.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.Center)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .background(Color.White, shape = RoundedCornerShape(40.dp))
                    .height(40.dp)
                    .width(200.dp)
                    .border(1.dp, Color(81, 78, 184),RoundedCornerShape(40.dp))
            ){
                Text(
                    text = "Sign Up",
                    fontSize = 14.sp,
                    color = Color.Gray,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Sign up using",
                fontSize = 14.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center
            ) {

                Spacer(modifier = Modifier.height(32.dp))

                Image(
                    painter = painterResource(R.drawable.facebook),
                    contentDescription = null,
                    modifier = Modifier
                        .height(40.dp)
                )

                Spacer(modifier = Modifier.padding(3.dp))

                Image(
                    painter = painterResource(R.drawable.googlemas),
                    contentDescription = null,
                    modifier = Modifier
                        .height(40.dp)
                )

                Spacer(modifier = Modifier.padding(3.dp))

                Image(
                    painter = painterResource(R.drawable.linkedin),
                    contentDescription = null,
                    modifier = Modifier
                        .height(40.dp)
                )
            }
        }
    }
}