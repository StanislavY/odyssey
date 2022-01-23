package ru.alexgladkov.odyssey_demo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val liveData: LiveData<AppState> = MutableLiveData()
}