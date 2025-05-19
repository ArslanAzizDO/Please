package com.tidoo.please.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import please.composeapp.generated.resources.Res
import please.composeapp.generated.resources.bg_social_1
import please.composeapp.generated.resources.bg_social_2
import please.composeapp.generated.resources.bg_social_3
import please.composeapp.generated.resources.bg_social_4
import please.composeapp.generated.resources.bg_social_5

@Composable
fun SocialMedia() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Follow Us @Modimal",
            fontSize = 22.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        BoxWithConstraints(
            modifier = Modifier.fillMaxWidth()
        ) {
            val totalWidth = maxWidth
            val mainImageHeight = totalWidth * 0.6f
            val smallImageHeight = mainImageHeight / 2
            val verticalSpacing = 8.dp

            val gridHeight = smallImageHeight * 2 + verticalSpacing

            LazyHorizontalGrid(
                rows = GridCells.Fixed(2),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(gridHeight),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(verticalSpacing),
                userScrollEnabled = false
            ) {
                item(span = { GridItemSpan(2) }) {
                    Image(
                        painter = painterResource(Res.drawable.bg_social_1),
                        contentDescription = "Main image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(mainImageHeight)
                            .aspectRatio(0.6f)
                    )
                }

                items(4) { index ->
                    val imageRes = when (index) {
                        0 -> Res.drawable.bg_social_2
                        1 -> Res.drawable.bg_social_3
                        2 -> Res.drawable.bg_social_4
                        else -> Res.drawable.bg_social_5
                    }

                    Image(
                        painter = painterResource(imageRes),
                        contentDescription = "Image $index",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(smallImageHeight)
                            .aspectRatio(1f)
                    )
                }
            }
        }
    }
}
