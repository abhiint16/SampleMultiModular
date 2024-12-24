package com.example.profile

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

internal class ProfileRepositoryImpl @Inject constructor() : ProfileRepository {
    override fun getProfileData(): Flow<ProfileData> {
        return flowOf(ProfileData())
    }
}