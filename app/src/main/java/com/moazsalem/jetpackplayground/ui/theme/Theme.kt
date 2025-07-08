package com.moazsalem.jetpackplayground.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF926247),
    secondary = PurpleGrey80,
    tertiary = Pink80,
    background = Color(0xFF251404),
    onBackground = Color(0xFFFFFFFF),
    onPrimaryContainer =  Color(0xFFFFFFFF),
    onSecondaryContainer = Color(0xFFE8DDD9),

)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF4F3422),
    secondary = PurpleGrey40,
    tertiary = Pink40,
    background = Color(0xFFF7F4F2),
    onBackground = Color(0xFF4F3422),
    onPrimaryContainer =  Color(0xFF4F3422),
    onSecondaryContainer = Color(0xFF736B66),


    /* Other default colors to override
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun JetpackPlaygroundTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}