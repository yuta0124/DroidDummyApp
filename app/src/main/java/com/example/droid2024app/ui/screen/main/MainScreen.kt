package com.example.droid2024app.ui.screen.main

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

// TODO: 本来は`Feature`モジュールの中に`Main`モジュールを作る
@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = hiltViewModel(),
) {
    val title: String by viewModel.title.collectAsStateWithLifecycle()

    Text(modifier = modifier, text = title)
}
