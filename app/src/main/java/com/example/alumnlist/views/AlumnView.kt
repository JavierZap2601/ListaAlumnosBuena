package com.example.alumnlisttarea4.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.alumnlist.R


@Composable
fun AlumnView(
    navController: NavHostController,
    message: String,
    id: Int,
    name: String,
    mail: String,
    semester: Int,
    career: String,
    hasScolarship: Boolean,
    gpa: Float,
    soldTickets: Int,
    profilePic: Int,
) {
    val hasScolarshipString = if (hasScolarship) "Si" else "No"

    Column (
        modifier = Modifier.fillMaxSize().padding(15.dp),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(
            onClick = {navController.popBackStack()},
            colors = ButtonDefaults.buttonColors(Color(0xFF456BDB)),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(horizontal = 5.dp)
        ) {
            Text(
                text = "Regresar",
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp
            )
        }
        Image(
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
                .size(100.dp)
                .clip(CircleShape),
            painter = painterResource(id = profilePic),
            contentDescription = "AlumnPic",
            contentScale = ContentScale.Crop,
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = id.toString() + " | " + name,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = mail,
            color = Color(0xFFD4A73C),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(15.dp))

        Column (

        ) {
            Text(
                text = "Semestre: $semester",
                fontSize = 20.sp,
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Carrera: $career",
                fontSize = 20.sp,
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Becado: $hasScolarshipString",
                fontSize = 20.sp,
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Promedio General: $gpa",
                fontSize = 20.sp,
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Boletos Vendidos: $soldTickets",
                fontSize = 20.sp,
            )
        }

        Spacer(modifier = Modifier.height(5.dp))

    }
}



