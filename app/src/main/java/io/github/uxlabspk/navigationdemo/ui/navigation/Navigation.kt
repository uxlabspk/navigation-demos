package io.github.uxlabspk.navigationdemo.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
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
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController)
        }
    ) { innerPadding ->
        NavHost(
            navController,
            startDestination = BottomNavItem.Home.route,
            modifier = modifier.padding(innerPadding)
        ) {
            composable(route = BottomNavItem.Home.route) {
                HomeScreen(navController)
            }
            composable(BottomNavItem.Profile.route) {
                ProfileScreen(navController)
            }
        }
    }
}