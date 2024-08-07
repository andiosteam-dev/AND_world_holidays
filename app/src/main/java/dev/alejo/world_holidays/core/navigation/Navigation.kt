package dev.alejo.world_holidays.core.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import dev.alejo.world_holidays.ui.presentation.about.view.AboutScreen
import dev.alejo.world_holidays.ui.presentation.home.view.HomeScreen

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Navigation(
    navHostController: NavHostController,
    startDestination: String
) {
    AnimatedNavHost(navController = navHostController, startDestination= startDestination) {
        composable(route = Screen.Home.route) {
            HomeScreen(navHostController = navHostController)
        }
        composable(route = Screen.About.route) {
            AboutScreen(navHostController = navHostController)
        }
    }
}