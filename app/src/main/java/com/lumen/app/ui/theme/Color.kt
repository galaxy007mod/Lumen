package com.lumen.app.ui.theme

import androidx.compose.ui.graphics.Color

// Semi-dark palette sampled from the EduAdmin / Laravel Hotel reference dashboards.
// Light mode = navy chrome (nav bar, banners) over light content.
// Dark mode  = the same palette fully navy.

// Primary — EduAdmin blue (light) / sky blue (dark)
val ForestGreen = Color(0xFF0052CC)          // name kept for existing imports; now brand blue
val ForestGreenDark = Color(0xFF00BAFF)

// Accent — red-orange (was Terracotta)
val Terracotta = Color(0xFFFF562F)
val TerracottaDark = Color(0xFFFF562F)

// Highlighter accent (keyword/snippet highlights) — orange
val AmberAccent = Color(0xFFFF9920)
val AmberAccentDark = Color(0xFFFF9920)

// Chrome (semi-dark parts: bottom bar, banners)
val ChromeNavy = Color(0xFF172B4C)
val ChromeNavyDeep = Color(0xFF112038)
val ChromeGreen = Color(0xFF10B47F)
val ChromeBlueBright = Color(0xFF397BF3)
val ChromeSelected = Color(0xFF00BAFF)
val ChromeUnselected = Color(0xFF93D2FE)

// Backgrounds
val WarmWhite = Color(0xFFFAFBFD)            // light content background
val DeepForestBg = Color(0xFF112038)         // dark background (EduAdmin deep navy)

// Surfaces
val SurfaceLight = Color(0xFFE9EEF4)
val SurfaceDark = Color(0xFF172B4C)
val SurfaceVariantDark = Color(0xFF1F2F51)

val SurfaceContainerLowestLight = Color(0xFFFFFFFF)
val SurfaceContainerLowLight = Color(0xFFF5F6F9)
val SurfaceContainerLight = Color(0xFFEEF1F8)
val SurfaceContainerHighLight = Color(0xFFE9EEF4)
val SurfaceContainerHighestLight = Color(0xFFE1EAF9)

val SurfaceContainerLowestDark = Color(0xFF0E1A30)
val SurfaceContainerLowDark = Color(0xFF142645)
val SurfaceContainerDark = Color(0xFF172B4C)
val SurfaceContainerHighDark = Color(0xFF1F2F51)
val SurfaceContainerHighestDark = Color(0xFF26396B)

// On-colors
val OnPrimaryLight = Color(0xFFFFFFFF)
val OnPrimaryDark = Color(0xFF112038)
val OnSurfaceLight = Color(0xFF172B4C)
val OnSurfaceDark = Color(0xFFFFFFFF)
val OnSurfaceVariantLight = Color(0xFF5A6A85)
val OnSurfaceVariantDark = Color(0xFFB9C7DE)

// Error
val ErrorRed = Color(0xFFE23030)
val ErrorRedDark = Color(0xFFFF562F)
val ErrorContainerLight = Color(0xFFFFDAD4)
val OnErrorContainerLight = Color(0xFF410002)
val ErrorContainerDark = Color(0xFF93000A)
val OnErrorContainerDark = Color(0xFFFFDAD4)

// OCR chip tint — teal
val OcrTint = Color(0xFF04A08B)
val OcrTintDark = Color(0xFF10B47F)
