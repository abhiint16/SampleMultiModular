package com.example.privacy

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text

@Composable
fun PrivacyScreen(viewModel: PrivacyViewModel) {
    val state = viewModel.privacyState.collectAsState()

    LaunchedEffect(key1 = Unit) {
        viewModel.getPrivacyData()
    }

    Column {
        PrivacyTopSection()
        PrivacyBottomSection()
    }
}

@Composable
fun PrivacyBottomSection() {
    Text(text = "PrivacyBottomSection")
}

@Composable
fun PrivacyTopSection() {
    Text(text = "PrivacyTopSection")
}