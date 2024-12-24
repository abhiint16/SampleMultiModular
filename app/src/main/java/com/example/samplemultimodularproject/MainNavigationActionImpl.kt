package com.example.samplemultimodularproject

import android.content.Context
import androidx.navigation.NavController
import com.example.navigation.MainNavigationAction

class MainNavigationActionImpl(
    navController: NavController,
    activity: Context,
    finishActivity: () -> Unit
): MainNavigationAction {
}