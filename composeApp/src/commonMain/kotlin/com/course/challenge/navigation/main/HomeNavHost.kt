package com.course.challenge.navigation.main

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.course.challenge.features.home.HomeScreen
import com.course.challenge.navigation.routes.HomeRoutes

@Composable
fun HomeNavHost(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        startDestination = HomeRoutes.Home
    ) {
        composable<HomeRoutes.Home> {
            HomeScreen()
        }
    }
}