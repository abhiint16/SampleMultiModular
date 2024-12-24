package com.example.profile.data

sealed class ProfileEvent {
    object NavigateToPrivacy : ProfileEvent()
    object NavigateToSettings : ProfileEvent()
}

sealed class ProfileState {
    object NavigateToPrivacy : ProfileEvent()
    object NavigateToSettings : ProfileEvent()
}