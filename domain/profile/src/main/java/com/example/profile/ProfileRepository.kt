package com.example.profile

import kotlinx.coroutines.flow.Flow

interface ProfileRepository {
    fun getProfileData(): Flow<ProfileData>
}