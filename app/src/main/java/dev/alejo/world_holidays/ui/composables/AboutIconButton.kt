package dev.alejo.world_holidays.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import dev.alejo.world_holidays.core.navigation.Screen

@Composable
fun AboutIconButton(navHostController: NavHostController) {
    Box(
        Modifier.fillMaxWidth()
    ) {
        IconButton(
            modifier = Modifier
                .align(alignment = Alignment.CenterEnd)
                .then(Modifier.size(24.dp)),
            onClick = { navigateToAboutScreen(navHostController) },
        ) {
            Icon(
                Icons.Default.Info,
                contentDescription = "",
                tint = Color.White
            )
        }
    }
}

fun navigateToAboutScreen(navHostController: NavHostController) {
    navHostController.navigate(Screen.Home.route)
}