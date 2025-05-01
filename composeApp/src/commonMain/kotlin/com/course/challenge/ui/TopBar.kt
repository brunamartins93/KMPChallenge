package com.course.challenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kmpchallenge.composeapp.generated.resources.Res
import kmpchallenge.composeapp.generated.resources.logo_kotlin
import org.jetbrains.compose.resources.painterResource
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    showBackButton: Boolean = false,
    onBackClick: () -> Unit = {},
    onAboutClick: () -> Unit = {},
) {
    var expanded by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 46.dp)
            .height(56.dp)
    ) {
        if (showBackButton) {
            IconButton(
                onClick = { onBackClick() },
                modifier = Modifier.align(Alignment.CenterStart)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Voltar",
                    tint = Color.White
                )
            }
        }

        Image(
            painter = painterResource(Res.drawable.logo_kotlin),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.Center)
                .height(56.dp)
        )
        Row(
            modifier = modifier
                .padding(start = 16.dp)
                .align(Alignment.CenterEnd)
        ) {
            IconButton(
                onClick = { expanded = !expanded },
            ) {
                Icon(
                    Icons.Default.MoreVert,
                    contentDescription = "Menu de Navegação",
                    tint = Color.White
                )
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
            ) {
                DropdownMenuItem(
                    text = {
                        Text("Sobre o App", fontSize = 16.sp)
                    },
                    onClick = {
                        expanded = false
                        onAboutClick.invoke()
                    },
                )
            }
        }

    }
}