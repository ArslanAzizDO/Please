package com.tidoo.please

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp

enum class DeviceBreakpoint {
    MobilePortrait,
    MobileLandscape,
    DesktopOrWeb
}

@Composable
fun rememberDeviceBreakpoint(): DeviceBreakpoint {
    var breakpoint by remember { mutableStateOf(DeviceBreakpoint.DesktopOrWeb) }

    BoxWithConstraints {
        val width = maxWidth
        val height = maxHeight

        breakpoint = when {
            width < 600.dp && height > width -> DeviceBreakpoint.MobilePortrait
            width < 600.dp && width >= height -> DeviceBreakpoint.MobileLandscape
            else -> DeviceBreakpoint.DesktopOrWeb
        }
    }

    return breakpoint
}