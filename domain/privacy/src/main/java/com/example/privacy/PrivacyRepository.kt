package com.example.privacy

import kotlinx.coroutines.flow.Flow

interface PrivacyRepository {
    fun getPrivacyData(): Flow<PrivacyData>
}