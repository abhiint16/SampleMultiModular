package com.example.privacy

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

internal class PrivacyRepositoryImpl @Inject constructor() : PrivacyRepository {
    override fun getProfileData(): Flow<PrivacyData> {
        return flowOf(PrivacyData())
    }
}