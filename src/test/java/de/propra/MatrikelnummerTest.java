package de.propra;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MatrikelnummerTest {
    @Test
    @DisplayName("Test that valid matrikelnummer evaluates to true")
    void testValidMatrikelnummer() {
        Matrikelnummer matrikelnummer = new Matrikelnummer(1, 9, 4, 2, 0, 0, 2);
        assertTrue(matrikelnummer.ist_gueltig());
    }
}