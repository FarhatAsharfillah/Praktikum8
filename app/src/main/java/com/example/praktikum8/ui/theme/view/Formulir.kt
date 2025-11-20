package com.example.praktikum8.ui.theme.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.questnavigasitugas_093.R
import kotlin.collections.forEach

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    navController: NavController
) {
    val jenisKList = listOf("Laki-Laki", "Perempuan")


    var nama by rememberSaveable { mutableStateOf("") }
    var alamat by rememberSaveable { mutableStateOf("") }
    var jenisKelamin by rememberSaveable { mutableStateOf(jenisKList[0]) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Formulir Isian", color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    )
