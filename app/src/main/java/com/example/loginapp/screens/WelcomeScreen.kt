import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.loginapp.R

@Composable
fun WelcomeScreen(navController: NavController) {
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

            Button(
                onClick = {
                    navController.navigate("login")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(81, 78, 184),
                    contentColor = Color.White
                ),
            ) {
                Text(
                    text = "Login",
                    fontSize = 14.sp,
                    color = Color.White,
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = {
                    navController.navigate("sign-up")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(81, 78, 184),
                    contentColor = Color.White
                ),
            ) {
                Text(
                    text = "Sign up",
                    fontSize = 14.sp,
                    color = Color.White,
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
