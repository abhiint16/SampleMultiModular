package com.example.profile

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text

@Composable
fun ProfileScreen(viewModel: ProfileViewModel) {
    val state = viewModel.profileState.collectAsState()

    LaunchedEffect(key1 = Unit) {
        viewModel.getProfileData()
    }

    Column {
        ProfileTopSection()
        ProfileBottomSection()
    }
}

@Composable
fun ProfileBottomSection(viewModel: ProfileViewModel) {
    Text(text = "BottomSection")
    Button(onClick = { viewModel.clickEvent() }) {
        Text(text = "Navigate to Privacy")
    }
}

@Composable
fun ProfileTopSection(viewModel: ProfileViewModel) {
    Text(text = "TopSection")
    Button(onClick = { viewModel.clickEvent() }) {
        Text(text = "Navigate to Settings")
    }
}