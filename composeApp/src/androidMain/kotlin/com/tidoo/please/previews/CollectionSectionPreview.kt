package com.tidoo.please.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.tidoo.please.components.CollectionSection

@Preview(showBackground = true, device = Devices.DESKTOP)
@Composable
fun CollectionSectionPreview() {
    CollectionSection()
}