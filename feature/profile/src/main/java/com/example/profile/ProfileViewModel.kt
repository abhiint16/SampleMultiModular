package com.example.profile

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject
import androidx.lifecycle.viewModelScope
import com.example.profile.data.ProfileEvent
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val profileRepository: ProfileRepository
) : ViewModel() {
    private val _profileState = MutableStateFlow(ProfileData())
    val profileState: StateFlow<ProfileData> = _profileState.asStateFlow()

    private val _profileEvent = MutableSharedFlow(ProfileEvent())
    val profileEvent: SharedFlow<ProfileEvent> = _profileEvent.asSharedFlow()

    fun getProfileData() {
//        _profileState = profileRepository.getProfileData().stateIn(
//            scope = viewModelScope,
//            started = SharingStarted.WhileSubscribed(5000), // Cache for 5000 milliseconds after no collectors
//            initialValue = ProfileData() // Initial value before the first emission
//        )
        viewModelScope.launch {
            profileRepository.getProfileData().collect {
                _profileState.value = it
            }
        }
    }

    fun clickBottomEvent(){
        _profileEvent =
    }

    fun clickTopEvent(){

    }
}