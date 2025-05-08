package com.tidoo.please

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextPainter.paint
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tidoo.please.theme.AppTheme
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import please.composeapp.generated.resources.Res
import please.composeapp.generated.resources.best_seller_1
import please.composeapp.generated.resources.best_seller_2
import please.composeapp.generated.resources.best_seller_3
import please.composeapp.generated.resources.bg_hero

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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Header()
            HeroBanner()
            BestSellers()
            CollectionSection()
            ModiWeek()
            SustainabilityBanner()
            SocialMedia()
            Footer()
        }
    }
}

@Composable
fun Header() {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        elevation = 1.dp,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
                .padding(horizontal = 16.dp, vertical = 12.dp)
            ,
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

            // Icons
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

@Composable
fun NavItem(text: String) {
    Text(
        text = text,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        modifier = Modifier.clickable {}
    )
}

@Composable
fun HeroBanner() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFFF5F5F0))
    ) {
        Image(
            painter = painterResource(Res.drawable.bg_hero),
            contentDescription = "Hero image with models",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 64.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Elegance In Simplicity,",
                fontSize = 28.sp,
                fontWeight = FontWeight.Light,
                color = Color.DarkGray
            )
            Text(
                text = "Earth's Harmony",
                fontSize = 28.sp,
                fontWeight = FontWeight.Light,
                color = Color.DarkGray,
                modifier = Modifier.padding(bottom = 24.dp)
            )
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.DarkGray
                ),
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text("Shop now")
            }
        }
    }
}

@Composable
fun BestSellers() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Best Sellers",
                fontSize = 22.sp,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = "View all",
                fontSize = 14.sp,
                color = Color.Gray,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.clickable {}
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ProductCard(
                name = "Tailored Overalls",
                price = "$300",
                drawable = Res.drawable.best_seller_1,
                colors = listOf(Color(0xFF303030), Color(0xFF615E59), Color(0xFF8C6A4F))
            )

            ProductCard(
                name = "Technical Silk",
                price = "$325",
                drawable = Res.drawable.best_seller_2,
                colors = listOf(Color(0xFF303030), Color(0xFF8C6A4F), Color(0xFF5E7358))
            )

            ProductCard(
                name = "Cool Weave",
                price = "$285",
                drawable = Res.drawable.best_seller_3,
                colors = listOf(Color(0xFF303030), Color(0xFF5E7358), Color(0xFFD7D0C8))
            )
        }
    }
}

@Composable
fun ProductCard(name: String, price: String, drawable : DrawableResource, colors: List<Color>) {
    Column(
        modifier = Modifier
            .width(250.dp)
            .clickable {}
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
                .background(Color.LightGray)
        ) {
            // Product image would be loaded here in a real app
            Image(
                painter = painterResource(drawable),
                contentDescription = name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            IconButton(
                onClick = {},
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(8.dp)
            ) {
                Icon(
                    Icons.Default.FavoriteBorder,
                    contentDescription = "Add to favorites",
                    tint = Color.White
                )
            }
        }

        Text(
            text = name,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 8.dp)
        )

        Text(
            text = price,
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 4.dp, bottom = 8.dp)
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            colors.forEach { color ->
                Box(
                    modifier = Modifier
                        .size(16.dp)
                        .background(color = color, shape = CircleShape)
                )
            }
        }
    }
}

@Composable
fun CollectionSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
    ) {
        Text(
            text = "Collection",
            fontSize = 22.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            CollectionCard(
                imageUrl = "collection1.jpg",
                title = "Blouses",
                modifier = Modifier.weight(1f)
            )
            CollectionCard(
                imageUrl = "collection2.jpg",
                title = "Pants",
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            CollectionCard(
                imageUrl = "collection3.jpg",
                title = "Dresses",
                modifier = Modifier.weight(1f)
            )
            CollectionCard(
                imageUrl = "collection4.jpg",
                title = "Coats",
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun CollectionCard(imageUrl: String, title: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .height(240.dp)
            .background(Color.LightGray)
            .clickable {}
    ) {
        // Collection image would be loaded here in a real app
        Image(
            imageResource(imageUrl),
            contentDescription = title,
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
                text = title,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun ModiWeek() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
    ) {
        Text(
            text = "Modiweek",
            fontSize = 22.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(5) { index ->
                ModiWeekCard(
                    day = when (index) {
                        0 -> "Sunday"
                        1 -> "Monday"
                        2 -> "Tuesday"
                        3 -> "Wednesday"
                        else -> "Thursday"
                    },
                    imageUrl = "modiweek${index + 1}.jpg"
                )
            }
        }
    }
}

@Composable
fun ModiWeekCard(day: String, imageUrl: String) {
    Column(
        modifier = Modifier.width(120.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.LightGray)
        ) {
            // ModiWeek image would be loaded here in a real app
            Image(
                imageResource(imageUrl),
                contentDescription = day,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            IconButton(
                onClick = {},
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(4.dp)
            ) {
                Icon(
                    Icons.Default.FavoriteBorder,
                    contentDescription = "Add to favorites",
                    tint = Color.White
                )
            }
        }

        Text(
            text = day,
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Composable
fun SustainabilityBanner() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color(0xFFF5F5F0))
    ) {
        // Sustainability image would be loaded here in a real app
        Image(
            imageResource("sustainability.jpg"),
            contentDescription = "Cotton branch",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Stylish Sustainability In Clothing Promotes Eco-Friendly Choices For A Greener Future",
                fontSize = 18.sp,
                fontWeight = FontWeight.Light,
                textAlign = TextAlign.Center,
                color = Color.DarkGray,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.DarkGray
                )
            ) {
                Text("Sustainability")
            }
        }
    }
}

@Composable
fun SocialMedia() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Follow Us @Modimal",
            fontSize = 22.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            for (i in 1..3) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .background(Color.LightGray)
                ) {
                    // Social media image would be loaded here in a real app
                    Image(
                        imageResource("social$i.jpg"),
                        contentDescription = "Social media post $i",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}

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