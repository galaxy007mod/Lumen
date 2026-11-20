package com.lumen.app.ui.theme

import androidx.compose.ui.graphics.Color
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Selected-state containers (segmented rows, filter chips, chip-styled pills)
 * consume the secondaryContainer slot — it must be navy/blue family in both
 * schemes, matching the bottom bar's selection indicator, never the retired
 * terracotta wash.
 */
class SelectionColorTest {

    // @spec SET-APPEAR-006
    @Test
    fun lightScheme_selectionContainerIsPaleBlue() {
        assertEquals(Color(0xFFE1EAF9), LightColorScheme.secondaryContainer)
        assertEquals(Color(0xFF172B4C), LightColorScheme.onSecondaryContainer)
    }

    // @spec SET-APPEAR-006
    @Test
    fun darkScheme_selectionContainerIsDeepNavyBlue() {
        assertEquals(Color(0xFF1B3D78), DarkColorScheme.secondaryContainer)
        assertEquals(Color(0xFFFFFFFF), DarkColorScheme.onSecondaryContainer)
    }
}
