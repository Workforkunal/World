package com.app.world.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.app.world.R

val PlayfairDisplay = FontFamily(
    Font(R.font.playfairdisplay_regular)
)
val AveriaSansLibre = FontFamily(
    Font(R.font.averiasanslibre_regular)
)
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = PlayfairDisplay,
        fontWeight = FontWeight.Normal,
        fontSize = 25.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = AveriaSansLibre,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    )
)