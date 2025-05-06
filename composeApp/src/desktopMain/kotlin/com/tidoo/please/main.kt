package com.tidoo.please

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableTarget
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.jetbrains.compose.ui.tooling.preview.Preview

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Please",
    ) {
        App()
    }
}

@Preview
@Composable
fun DesktopPreview(){
    App()
}