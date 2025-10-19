package com.sako.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.sako.R
import com.sako.ui.theme.ProgressTrack
import com.sako.ui.theme.TextSecondary

@Composable
fun XPCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .background(MaterialTheme.colorScheme.surface, RoundedCornerShape(16.dp))
            .padding(16.dp),
    ) {
        Column {
            Text(
                text = stringResource(R.string.nama_user),
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = stringResource(R.string.ayo_terus_belajar_dan_kumpulkan_xp),
                style = MaterialTheme.typography.bodySmall.copy(color = TextSecondary)
            )

            Spacer(modifier = Modifier.height(8.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                LinearProgressIndicator(
                    progress = 1250f / 2000f,
                    color = MaterialTheme.colorScheme.primary,
                    trackColor = ProgressTrack,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(8.dp)
                        .weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("1250/2000", style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}
