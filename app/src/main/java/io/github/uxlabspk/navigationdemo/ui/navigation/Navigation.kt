package io.github.uxlabspk.navigationdemo.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.github.uxlabspk.navigationdemo.ui.screens.HomeScreen
import io.github.uxlabspk.navigationdemo.ui.screens.ProfileScreen

@Composable
fun Navigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController,
        startDestination = "home",
        modifier = modifier
    ) {
        composable(route = "home") {
            HomeScreen(navController)
        }
        composable("profile") {
            ProfileScreen(navController)
        }
    }
}