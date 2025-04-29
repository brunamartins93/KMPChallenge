package com.course.challenge.navigation.routes

import kotlinx.serialization.Serializable

sealed interface AppRoutes {
    @Serializable
    data object Home : AppRoutes
    @Serializable
    data object Details : AppRoutes
    @Serializable
    data object About : AppRoutes
}