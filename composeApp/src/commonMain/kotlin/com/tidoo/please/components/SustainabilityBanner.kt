package com.tidoo.please.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import please.composeapp.generated.resources.Res
import please.composeapp.generated.resources.bg_hero_bottom

@Composable
fun SustainabilityBanner() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF5F5F0))
    ) {
        // Sustainability image would be loaded here in a real app
        Image(
            painter = painterResource(Res.drawable.bg_hero_bottom),
            contentDescription = "Cotton branch",
            contentScale = ContentScale.Crop, // Crops the image to fill the bounds
            modifier = Modifier
                .fillMaxWidth() // Makes the image take full width
        )

        Column(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(36.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Stylish Sustainability In Clothing Promotes Eco-Friendly Choices For A Greener Future",
                fontSize = 18.sp,
                fontWeight = FontWeight.Light,
                textAlign = TextAlign.Center,
                color = Color.DarkGray,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.DarkGray
                )
            ) {
                Text("Sustainability")
            }
        }
    }
}
