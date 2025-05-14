package com.tidoo.please.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Footer() {
    Surface(
        color = Color(0xFFF5F5F5),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp)
        ) {
            // Newsletter signup
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Join Our Club, Get 15% Off For Your Birthday",
                    fontSize = 16.sp,
                    modifier = Modifier.weight(1f)
                )

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    placeholder = { Text("Enter your email...") },
                    trailingIcon = {
                        IconButton(onClick = {}) {
                            Icon(Icons.Default.ArrowForward, contentDescription = "Submit")
                        }
                    },
                    modifier = Modifier.weight(1f)
                )
            }

            Divider()

            // Footer links
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                FooterLinkColumn(
                    title = "About Modimal",
                    links = listOf("Our Story", "Sustainability", "Privacy Policy", "Support System", "Return & Exchanges")
                )

                FooterLinkColumn(
                    title = "Help & Support",
                    links = listOf("Shipping & Delivery", "Returns & Exchange", "FAQs", "Contact Us")
                )

                FooterLinkColumn(
                    title = "Join Us",
                    links = listOf("Modimal Club", "Careers", "Visit Us")
                )

                Column {
                    Text(
                        text = "Follow Us",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
//                        Icon(Icons.Default.Facebook, contentDescription = "Facebook")
//                        Icon(Icons.Default.Instagram, contentDescription = "Instagram")
//                        Icon(Icons.Default.Twitter, contentDescription = "Twitter")
//                        Icon(Icons.Default.YouTube, contentDescription = "YouTube")
                        Icon(Icons.Default.ShoppingCart, contentDescription = "Facebook")
                        Icon(Icons.Default.ShoppingCart, contentDescription = "Instagram")
                        Icon(Icons.Default.ShoppingCart, contentDescription = "Twitter")
                        Icon(Icons.Default.ShoppingCart, contentDescription = "YouTube")
                    }
                }
            }

            Divider()

            // Copyright
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "© Modimal 2025. All Rights Reserved.",
                    fontSize = 14.sp,
                    color = Color.Gray
                )

                Text(
                    text = "info@modimal.com",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }
        }
    }
}

@Composable
fun FooterLinkColumn(title: String, links: List<String>) {
    Column {
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        links.forEach { link ->
            Text(
                text = link,
                fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier
                    .padding(vertical = 4.dp)
                    .clickable {}
            )
        }
    }
}
