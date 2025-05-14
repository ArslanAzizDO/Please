package com.tidoo.please.models

import org.jetbrains.compose.resources.DrawableResource
import please.composeapp.generated.resources.Res
import please.composeapp.generated.resources.bg_collection_1
import please.composeapp.generated.resources.bg_collection_2
import please.composeapp.generated.resources.bg_collection_3
import please.composeapp.generated.resources.bg_collection_4

data class Collection(
    val title: String,
    val drawable: DrawableResource
)

val collections = listOf(
    Collection(
        title = "Sunday",
        drawable = Res.drawable.bg_collection_1,
    ),
    Collection(
        title = "Monday",
        drawable = Res.drawable.bg_collection_2,
    ),
    Collection(
        title = "Tuesday",
        drawable = Res.drawable.bg_collection_3,
    ),
    Collection(
        title = "Wednesday",
        drawable = Res.drawable.bg_collection_4,
    )
)