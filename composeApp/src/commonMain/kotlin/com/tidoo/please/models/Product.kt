package com.tidoo.please.models

import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource
import please.composeapp.generated.resources.Res
import please.composeapp.generated.resources.best_seller_1
import please.composeapp.generated.resources.best_seller_2
import please.composeapp.generated.resources.best_seller_3

data class Product (
    val name: String,
    val price: String,
    val drawable: DrawableResource,
    val colors: List<Color>
)

val products = listOf(
    Product(
        name = "Tailored Overalls",
        price = "$300",
        drawable = Res.drawable.best_seller_1,
        colors = listOf(Color(0xFF303030), Color(0xFF615E59), Color(0xFF8C6A4F))
    ),
    Product(
        name = "Technical Silk",
        price = "$325",
        drawable = Res.drawable.best_seller_2,
        colors = listOf(Color(0xFF303030), Color(0xFF8C6A4F), Color(0xFF5E7358))
    ),
    Product(
        name = "Cool Weave",
        price = "$285",
        drawable = Res.drawable.best_seller_3,
        colors = listOf(Color(0xFF303030), Color(0xFF5E7358), Color(0xFFD7D0C8))
    )
)