package com.tidoo.please.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tidoo.please.DeviceBreakpoint
import com.tidoo.please.rememberDeviceBreakpoint

@Composable
fun Header() {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        elevation = 1.dp,
    ) {

        val breakpoint = rememberDeviceBreakpoint()

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Logo
            Text(
                text = "zasa.",
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium
            )

            // Navigation
            if (breakpoint == DeviceBreakpoint.DesktopOrWeb) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    NavItem("Collection")
                    NavItem("New In")
                    NavItem("Modiweek")
                    NavItem("Plus Size")
                    NavItem("Sustainability")
                }
            }

            // Icons
            if (breakpoint == DeviceBreakpoint.DesktopOrWeb) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Search, contentDescription = "Search")
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Person, contentDescription = "Account")
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.FavoriteBorder, contentDescription = "Favorites")
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Search, contentDescription = "Cart")
                        //                    Icon(Icons.Default.ShoppingBag, contentDescription = "Cart")
                    }
                }
            }
        }
    }
}

@Composable
fun NavItem(text: String) {
    Text(
        text = text,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        modifier = Modifier.clickable {}
    )
}
