package com.course.challenge

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform