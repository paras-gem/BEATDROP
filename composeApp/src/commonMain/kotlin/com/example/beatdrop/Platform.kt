package com.example.beatdrop

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform