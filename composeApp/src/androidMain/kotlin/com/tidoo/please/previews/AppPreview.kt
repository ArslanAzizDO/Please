package com.tidoo.please.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.tidoo.please.ModimalApp


@Preview(
    showBackground = true,
    device = Devices.DESKTOP
)
@Preview(
    showBackground = true,
)
@Composable
fun AppAndroidPreview() {
    ModimalApp()
}
