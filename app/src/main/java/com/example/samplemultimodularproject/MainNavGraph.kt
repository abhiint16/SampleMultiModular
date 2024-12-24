package com.example.samplemultimodularproject

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation.Destinations
import com.example.navigation.MainNavigationAction
import com.example.profile.ProfileScreen
import com.example.profile.ProfileViewModel


@Composable
fun MainNavGraph(
    activity: Context,
    finishActivity: () -> Unit,
    startDestination: String = Destinations.Profile.route
) {
    val navController = rememberNavController()
    val navActions: MainNavigationAction =
        remember(navController) {
            MainNavigationActionImpl(
                navController, activity = activity, finishActivity
            )
        }
    CompositionLocalProvider(
        LocalNavigationAction provides navActions
    ) {
        NavHost(navController = navController, startDestination = startDestination) {
            composable(
                route = Destinations.Profile.route,
            ) {
                val profileViewModel: ProfileViewModel = hiltViewModel()
                ProfileScreen(
                    viewModel = profileViewModel
                )
            }
        }
    }
}

val LocalNavigationAction = staticCompositionLocalOf<MainNavigationAction> {
    error("No NavigationAction specified")
}