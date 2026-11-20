package com.lumen.app.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// Internal (not private) so unit tests can pin the selection-container tones.
internal val LightColorScheme = lightColorScheme(
    primary = ForestGreen,
    onPrimary = OnPrimaryLight,
    // Navy banner/toolbar container (semi-dark chrome over light content).
    primaryContainer = ChromeNavy,
    onPrimaryContainer = Color.White,
    secondary = AmberAccent,
    onSecondary = ChromeNavy,
    // Selection containers (segmented rows, filter chips, chip-styled pills).
    // @spec SET-APPEAR-006
    secondaryContainer = Color(0xFFE1EAF9),
    onSecondaryContainer = ChromeNavy,
    tertiary = OcrTint,
    onTertiary = Color(0xFFFFFFFF),
    background = WarmWhite,
    onBackground = OnSurfaceLight,
    surface = WarmWhite,
    onSurface = OnSurfaceLight,
    surfaceVariant = SurfaceLight,
    onSurfaceVariant = OnSurfaceVariantLight,
    surfaceTint = ForestGreen,
    surfaceContainerLowest = SurfaceContainerLowestLight,
    surfaceContainerLow = SurfaceContainerLowLight,
    surfaceContainer = SurfaceContainerLight,
    surfaceContainerHigh = SurfaceContainerHighLight,
    surfaceContainerHighest = SurfaceContainerHighestLight,
    error = ErrorRed,
    errorContainer = ErrorContainerLight,
    onErrorContainer = OnErrorContainerLight,
    outline = Color(0xFF8A97AD),
)

internal val DarkColorScheme = darkColorScheme(
    primary = ForestGreenDark,
    onPrimary = OnPrimaryDark,
    primaryContainer = ForestGreen,
    onPrimaryContainer = Color.White,
    secondary = AmberAccentDark,
    onSecondary = ChromeNavyDeep,
    // @spec SET-APPEAR-006
    secondaryContainer = Color(0xFF1F2F51),
    onSecondaryContainer = Color(0xFF93D2FE),
    tertiary = OcrTintDark,
    onTertiary = ChromeNavyDeep,
    background = DeepForestBg,
    onBackground = OnSurfaceDark,
    surface = DeepForestBg,
    onSurface = OnSurfaceDark,
    surfaceVariant = SurfaceVariantDark,
    onSurfaceVariant = OnSurfaceVariantDark,
    surfaceTint = ForestGreenDark,
    surfaceContainerLowest = SurfaceContainerLowestDark,
    surfaceContainerLow = SurfaceContainerLowDark,
    surfaceContainer = SurfaceContainerDark,
    surfaceContainerHigh = SurfaceContainerHighDark,
    surfaceContainerHighest = SurfaceContainerHighestDark,
    error = ErrorRedDark,
    errorContainer = ErrorContainerDark,
    onErrorContainer = OnErrorContainerDark,
    outline = Color(0xFF56657F),
)

/**
 * The resolved dark/light value for the whole app — the Theme setting applied,
 * with SYSTEM already resolved. Chrome surfaces (viewer status-bar contrast,
 * canvas colors) read this instead of querying the system theme, so they
 * follow the user's choice.
 */
// @spec SET-APPEAR-003
val LocalLumenDarkTheme = staticCompositionLocalOf { false }

@Composable
fun LumenTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    CompositionLocalProvider(LocalLumenDarkTheme provides darkTheme) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }
}

/** Dark "chrome" colors for the semi-dark look: navy in light mode, deeper navy in dark mode. */
object LumenChrome {
    val container: Color
        @Composable get() = if (LocalLumenDarkTheme.current) ChromeNavyDeep else ChromeNavy
    val selected: Color get() = ChromeSelected
    val unselected: Color get() = ChromeUnselected.copy(alpha = 0.75f)
    val indicator: Color get() = ChromeSelected.copy(alpha = 0.18f)
}
