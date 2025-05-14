package com.tidoo.please.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import please.composeapp.generated.resources.Res
import please.composeapp.generated.resources.bg_hero

@Composable
fun HeroBanner() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFFF5F5F0))
    ) {
        Image(
            painter = painterResource(Res.drawable.bg_hero),
            contentDescription = "Hero image with models",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 64.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Elegance In Simplicity,",
                fontSize = 28.sp,
                fontWeight = FontWeight.Light,
                color = Color.White
            )
            Text(
                text = "Earth's Harmony",
                fontSize = 28.sp,
                fontWeight = FontWeight.Light,
                color = Color.White,
                modifier = Modifier.padding(bottom = 24.dp)
            )
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.DarkGray
                ),
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text("Shop now")
            }
        }
    }
}
