package com.tidoo.please.models

import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource
import please.composeapp.generated.resources.Res
import please.composeapp.generated.resources.best_seller_1
import please.composeapp.generated.resources.best_seller_2
import please.composeapp.generated.resources.best_seller_3
import please.composeapp.generated.resources.bg_modi_week_1
import please.composeapp.generated.resources.bg_modi_week_2
import please.composeapp.generated.resources.bg_modi_week_3
import please.composeapp.generated.resources.bg_modi_week_4
import please.composeapp.generated.resources.bg_modi_week_5

data class ModiWeek (
    val day: String,
    val drawable: DrawableResource
)

val modiWeekList = listOf(
    ModiWeek(
        day = "Sunday",
        drawable = Res.drawable.bg_modi_week_1,
    ),
    ModiWeek(
        day = "Monday",
        drawable = Res.drawable.bg_modi_week_2,
    ),
    ModiWeek(
        day = "Tuesday",
        drawable = Res.drawable.bg_modi_week_3,
    ),
    ModiWeek(
        day = "Wednesday",
        drawable = Res.drawable.bg_modi_week_4,
    ),
    ModiWeek(
        day = "Thursday",
        drawable = Res.drawable.bg_modi_week_5,
    )
)