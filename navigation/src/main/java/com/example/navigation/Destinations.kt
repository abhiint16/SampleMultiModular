package com.example.navigation

sealed class Destinations(val route: String) {
    object Splash: Destinations("splash")
    object Login: Destinations("login")
    object Settings: Destinations("settings")
    object Profile: Destinations("profile")
    object Privacy: Destinations("privacy")
}
