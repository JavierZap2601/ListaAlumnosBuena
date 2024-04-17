package com.example.alumnlist.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.alumnlist.models.Alumn
import com.example.alumnlist.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlumnCard(navController: NavHostController, alumn: Alumn, color: Color) {
    val message = "No afortunado"

    Card(
        colors = CardDefaults.cardColors(containerColor = color),
        onClick = {
            navController.navigate("AlumnView" +
                    "/$message" +
                    "/${alumn.id}" +
                    "/${alumn.name}" +
                    "/${alumn.mail}" +
                    "/${alumn.semester}" +
                    "/${alumn.career}" +
                    "/${alumn.hasScolarship}" +
                    "/${alumn.gpa.toFloat()}" +
                    "/${alumn.soldTickets}" +
                    "/${alumn.profilePic}"
            )
        }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 20.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .size(20.dp)
                    .clip(CircleShape),
                painter = painterResource(id = alumn.profilePic),
                contentDescription = "AlumnPic",
                contentScale = ContentScale.Crop,

            )

            Spacer(modifier = Modifier.width(10.dp))

            Column (

            ) {
                Text(
                    text = "${alumn.id} | ${alumn.name}",

                    color = Color(0xFF000000),
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "${alumn.mail}",

                    color = Color(0xFFFFC107)
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "${alumn.career}",

                    color = Color(0xFF000000)
                )
            }
        }
    }
}

