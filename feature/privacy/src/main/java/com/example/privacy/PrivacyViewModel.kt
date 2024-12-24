package com.example.privacy

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PrivacyViewModel @Inject constructor(
    private val privacyRepository: PrivacyRepository
) : ViewModel() {
    private val _privacyState = MutableStateFlow(PrivacyData())
    val privacyState: StateFlow<PrivacyData> = _privacyState.asStateFlow()

    fun getPrivacyData() {
//        _profileState = profileRepository.getProfileData().stateIn(
//            scope = viewModelScope,
//            started = SharingStarted.WhileSubscribed(5000), // Cache for 5000 milliseconds after no collectors
//            initialValue = ProfileData() // Initial value before the first emission
//        )
        viewModelScope.launch {
            privacyRepository.getPrivacyData().collect {
                _privacyState.value = it
            }
        }
    }
}