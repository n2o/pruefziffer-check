package de.propra;


record Matrikelnummer(int i0, int i1, int i2, int i3, int i4, int i5, int i6) {
    /**
     * Eine Matrikelnummer ist gültig, wenn die letzte Ziffer folgende Zahl
     * ergibt:
     * (1. Stelle multipliziert mit 9, plus
     * 2. Stelle * 7, plus
     * 3. Stelle * 3, plus
     * 4. Stelle * 9, plus
     * 5. Stelle * 7, plus
     * 6. Stelle * 3)
     * modulo 10
     */
    boolean ist_gueltig() {
        int check = (this.i0 * 9 +
                this.i1 * 7 +
                this.i2 * 3 +
                this.i3 * 9 +
                this.i4 * 7 +
                this.i5 * 3) % 10;
        return check == this.i6;
    }
}
