package com.tidoo.please

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform