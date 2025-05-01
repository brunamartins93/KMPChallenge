package com.course.challenge.features.about

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.course.challenge.ui.TopBar

@Composable
fun AboutScreen(
    onBackPressed: () -> Unit
) {
    AboutContent(
        onBackPressed = onBackPressed
    )
}

@Composable
fun AboutContent(
    onBackPressed: () -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color.Black,
        topBar = {
            TopBar (
                showBackButton = true,
                onBackClick = onBackPressed
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    modifier = Modifier.padding(16.dp),
                    text = "Hello Sobre o App",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                )
            }
        }
    )
}