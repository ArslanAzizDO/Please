package com.tidoo.please

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import com.tidoo.please.components.BestSellers
import com.tidoo.please.components.CollectionSection
import com.tidoo.please.components.Footer
import com.tidoo.please.components.Header
import com.tidoo.please.components.HeroBanner
import com.tidoo.please.components.ModiWeek
import com.tidoo.please.components.SocialMedia
import com.tidoo.please.components.SustainabilityBanner
import com.tidoo.please.theme.AppTheme

@Composable
fun ModimalApp() {
    AppTheme {
        ModimalLandingPage()
    }
}

@Composable
fun ModimalLandingPage() {
    // test
    val scrollState = rememberScrollState()
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            item {
                Header()
            }
            item {
                HeroBanner()
            }
            item {
                BestSellers()
            }
            item {
                CollectionSection()
            }
            item {
                ModiWeek()
            }
            item {
                SustainabilityBanner()
            }
            item {
                SocialMedia()
            }
            item {
                Footer()
            }
        }
    }
}

// Utility function to simulate loading images in multiplatform context
// In a real app, you would use Compose ImageLoader or other appropriate image loading
@Composable
fun imageResource(path: String): ImageBitmap {
    // Generate a placeholder color based on the filename hash
    val hash = path.hashCode()
    val color = Color(
        red = (hash and 0xFF) / 255f,
        green = ((hash shr 8) and 0xFF) / 255f,
        blue = ((hash shr 16) and 0xFF) / 255f
    )

    // Create a colored placeholder bitmap
    return ImageBitmap(300, 300).apply {
        // This would create a solid color bitmap in a real implementation
        // For now, this is just a placeholder return
    }
}