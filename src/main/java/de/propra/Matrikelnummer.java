package de.propra;


class Matrikelnummer {
    private final int i0;
    private final int i1;
    private final int i2;
    private final int i3;
    private final int i4;
    private final int i5;
    private final int i6;

    public Matrikelnummer(int i0, int i1, int i2, int i3, int i4, int i5, int i6) {
        this.i0 = i0;
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
        this.i5 = i5;
        this.i6 = i6;
    }

    public static void main(String[] args) {
        var matrikelnummer = new Matrikelnummer(1, 9, 4, 2, 0, 0, 2);
        if (matrikelnummer.ist_gueltig()) {
            System.out.println("Matrikelnummer gültig 🎉");
        } else {
            System.out.println("Matrikelnummer ungültig 😭");
        }
    }

    /**
     * Eine Matrikelnummer ist gueltig, wenn die letzte Ziffer folgende Zahl
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
