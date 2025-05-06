package com.tidoo.please

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.lightColors
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import please.composeapp.generated.resources.Res
import please.composeapp.generated.resources.compose_multiplatform

@Composable
fun ModimalApp() {
    MaterialTheme(
        colors = lightColors(
            primary = Color(0xFF303030),
            secondary = Color(0xFF8C6A4F),
            background = Color(0xFFFCFCFC),
            surface = Color.White
        ),
        typography = Typography(
            defaultFontFamily = FontFamily.Default
        )
    ) {
        ModimalLandingPage()
    }
}