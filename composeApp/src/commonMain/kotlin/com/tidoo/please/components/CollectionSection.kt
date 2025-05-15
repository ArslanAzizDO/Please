package com.tidoo.please.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tidoo.please.models.Collection
import com.tidoo.please.models.collections
import org.jetbrains.compose.resources.painterResource

@Composable
fun CollectionSection() {
    Column {
        Text(
            text = "Collection",
            fontSize = 22.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(bottom = 24.dp)
        )
        LazyVerticalStaggeredGrid(
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(max = (Short.MAX_VALUE).toInt().dp)
                .padding(24.dp),
            userScrollEnabled = false,
            columns = StaggeredGridCells.Fixed(2),
            contentPadding = PaddingValues(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            items(collections.size) { index ->
                CollectionCard(
                    collections[index]
                )
            }
        }
    }
}

@Composable
fun CollectionCard(collection: Collection) {
    Box(
        modifier = Modifier
            .background(Color.LightGray)
            .clickable {}
    ) {
        // Collection image would be loaded here in a real app
        Image(
            painter = painterResource(collection.drawable),
            contentDescription = collection.title,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .background(Color.White.copy(alpha = 0.8f))
                .padding(vertical = 8.dp)
        ) {
            Text(
                text = collection.title,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
