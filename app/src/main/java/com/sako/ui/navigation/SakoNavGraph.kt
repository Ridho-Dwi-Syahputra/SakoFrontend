package com.sako.ui.navigation

import androidx.compose.runtime.Composable
import com.sako.ui.screen.home.HomeScreen

// Minimal nav graph to keep the app running safely
@Composable
fun SakoNavGraph() {
	// For now, just show HomeScreen directly.
	// Later, this can be replaced with Navigation-Compose NavHost.
	HomeScreen()
}