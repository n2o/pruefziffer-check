package de.propra;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MatrikelnummerTest {
    @Test
    @DisplayName("Gültige Prüfziffer in Matrikelnummer ist gültig")
    void testGueltigeMatrikelnummer() {
        Matrikelnummer matrikelnummer = new Matrikelnummer(9, 9, 9, 9, 9, 9, 2);
        assertTrue(matrikelnummer.ist_gueltig());
    }

    @Test
    @DisplayName("Falsche Prüfziffer schlägt fehl")
    void testUngueltigeMatrikelnummer() {
        Matrikelnummer matrikelnummer = new Matrikelnummer(9, 9, 9, 9, 9, 9, 9);
        assertFalse(matrikelnummer.ist_gueltig());
    }
}