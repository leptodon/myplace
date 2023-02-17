package ru.cactus.myplace

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform