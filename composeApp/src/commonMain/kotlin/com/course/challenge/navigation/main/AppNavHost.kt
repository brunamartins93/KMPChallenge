package com.course.challenge.navigation.main

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.course.challenge.features.about.AboutScreen
import com.course.challenge.features.home.HomeScreen
import com.course.challenge.navigation.routes.AppRoutes

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        startDestination = AppRoutes.Home
    ) {
        composable<AppRoutes.Home> {
            HomeScreen(
                navigateToAboutScreen = {
                    navHostController.navigate(AppRoutes.About)
                }
            )
        }
        composable<AppRoutes.About> {
            AboutScreen(
                onBackPressed = {
                    navHostController.popBackStack()
                }
            )
        }
    }
}