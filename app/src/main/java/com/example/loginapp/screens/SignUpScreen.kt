package com.example.loginapp.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.loginapp.R

@Composable
fun SignUpScreen(navController: NavController) {

    var name by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordConfirm by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var number by remember { mutableStateOf("") }

    var mailError by remember { mutableStateOf(false) }
    var nameError by remember { mutableStateOf(false) }
    var numberError by remember { mutableStateOf(false) }
    var passwordError by remember { mutableStateOf(false) }


    fun isValidEmail (email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
    fun onlyLetters(name: String): Boolean {
        return name.matches("^[a-zA-Z]*$".toRegex())
    }
    fun onlyNumbers(number: String): Boolean {
        return number.matches("^[0-9]*$".toRegex())
    }
    fun isValidNumber(number: String): Boolean {
        return number.length == 10
    }
    fun isValidPassword(password: String): Boolean {
        return password == passwordConfirm
    }
    fun buttonActive(): Boolean {
        return isValidEmail(email) && onlyLetters(name) && isValidNumber(number) && isValidPassword(password)
    }
    
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

            Text(
                text = "Sign Up",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier,
            ) {
                Column(
                    modifier = Modifier
                ) {
                    Text(
                        text = "Name",
                        fontSize = 16.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(5.dp)
                    )

                    TextField(
                        value = name,
                        onValueChange = {name = it},
                        modifier = Modifier
                            .width(280.dp)
                            .height(40.dp)
                            .border(
                                BorderStroke(1.dp, Color.Gray),
                                RoundedCornerShape(12.dp)
                            ),
                        colors = TextFieldDefaults.colors(
                            unfocusedIndicatorColor = Color.Transparent,
                            unfocusedContainerColor = Color.White
                        ),
                        shape = RoundedCornerShape(12.dp)

                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }

            Box(
                modifier = Modifier,
            ) {
                Column(
                    modifier = Modifier
                        .padding(top = 10.dp)
                ) {
                    Text(
                        text = "Email",
                        fontSize = 16.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(5.dp)
                    )
                    TextField(
                        value = email,
                        onValueChange = {
                            email = it
                            mailError = email.isNotBlank() && !isValidEmail(it)
                                        },
                        isError = mailError,
                        modifier = Modifier
                            .width(280.dp)
                            .height(40.dp)
                            .border(
                                BorderStroke(1.dp, Color.Gray),
                                RoundedCornerShape(12.dp)
                            ),
                        colors = TextFieldDefaults.colors(
                            unfocusedIndicatorColor = Color.Transparent,
                            unfocusedContainerColor = Color.White
                        ),

                        shape = RoundedCornerShape(12.dp)

                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Box(
                modifier = Modifier,
            ) {
                Column(
                    modifier = Modifier
                        .padding(
                            top = 14.dp,
                        )
                ) {
                    Text(
                        text = "Number",
                        fontSize = 16.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(5.dp)
                    )

                    TextField(
                        value = number,
                        onValueChange = { number = it
                                        numberError = number.isNotBlank() && !isValidNumber(it)
                                        },
                        isError = numberError,
                        modifier = Modifier
                            .width(280.dp)
                            .height(40.dp)
                            .border(
                                BorderStroke(1.dp, Color.Gray),
                                RoundedCornerShape(12.dp)
                            ),
                        colors = TextFieldDefaults.colors(
                            unfocusedIndicatorColor = Color.Transparent,
                            unfocusedContainerColor = Color.White
                        ),
                        shape = RoundedCornerShape(12.dp),

                        //Cambia al teclado numerico
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number
                        )

                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Box(
                modifier = Modifier,
            ) {
                Column(
                    modifier = Modifier
                        .padding(
                            top = 14.dp,
                        )
                ) {
                    Text(
                        text = "Password",
                        fontSize = 16.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(5.dp)
                    )

                    TextField(
                        value = password,
                        onValueChange = { password = it },
                        modifier = Modifier
                            .width(280.dp)
                            .height(40.dp)
                            .border(
                                BorderStroke(1.dp, Color.Gray),
                                RoundedCornerShape(12.dp)
                            ),
                        colors = TextFieldDefaults.colors(
                            unfocusedIndicatorColor = Color.Transparent,
                            unfocusedContainerColor = Color.White
                        ),
                        shape = RoundedCornerShape(12.dp),

                        //Permite ocultar el contenido de la contraseña
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Password
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Box(
                modifier = Modifier,
            ) {
                Column(
                    modifier = Modifier
                        .padding(
                            top = 14.dp,
                        )
                ) {
                    Text(
                        text = "Confirm Password",
                        fontSize = 16.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(5.dp)
                    )

                    TextField(
                        value = passwordConfirm,
                        onValueChange = { passwordConfirm = it
                                        passwordError = passwordConfirm.isNotBlank() && !isValidPassword(it)
                                        },
                        isError = passwordError,
                        modifier = Modifier
                            .width(280.dp)
                            .height(40.dp)
                            .border(
                                BorderStroke(1.dp, Color.Gray),
                                RoundedCornerShape(12.dp)
                            ),
                        colors = TextFieldDefaults.colors(
                            unfocusedIndicatorColor = Color.Transparent,
                            unfocusedContainerColor = Color.White
                        ),
                        shape = RoundedCornerShape(12.dp),

                        //Permite ocultar el contenido de la contraseña
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Password
                        )
                    )
                    Text(
                        text = "Forgot Password?",
                        fontSize = 12.sp,
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(10.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(81, 78, 184),
                    contentColor = Color.White
                ),
                enabled = buttonActive()
            ) {
                Text(
                    text = "Sign Up",
                    fontSize = 14.sp,
                    color = Color.White,
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {
                    navController.navigate("welcome")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Gray
                ),
            ) {
                Text(
                    text = "Return",
                    fontSize = 14.sp,
                )
            }
        }
    }
}