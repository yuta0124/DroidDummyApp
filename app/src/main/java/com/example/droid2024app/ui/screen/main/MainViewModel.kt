package com.example.droid2024app.ui.screen.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    /**
     * savedStateHandlerを用いる際にFlowの方が簡潔に書けるため、ViewModelではFlowを利用する
     * https://zenn.dev/aniokrait/scraps/f4044b38c90e02
     * もしかしたらStateでもいい感じに描けるのかも、ただまだ試験的なものっぽい https://zenn.dev/aniokrait/scraps/f4044b38c90e02
     */
    private val _title: MutableStateFlow<String> = MutableStateFlow("メイン")
    val title: StateFlow<String> = _title.asStateFlow()
}
