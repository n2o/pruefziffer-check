# Matrikelnummern verifizieren

Mit diesem Programm wollen wir die Prüfziffer einer Matrikelnummer der
Studierenden der HHU überprüfen. Die letzte Ziffer prüft die vorangegangenen
Ziffern, indem eine kleine Formel angewandt wird, die als Ergebnis die letzte
Ziffer ergeben muss.

Die Formel lautet:

    (1. Stelle der Matrikelnummer multipliziert mit 9, plus
    2. Stelle * 7, plus
    3. Stelle * 3, plus
    4. Stelle * 9, plus
    5. Stelle * 7, plus
    6. Stelle * 3)
    modulo 10

Beispiel: Die Matrikelnummer 999992 ist gültig, weil die letzte Ziffer, die `2`
mit der folgenden Formel übereinstimmt:

```
(9 * 9 + 9 * 7 + 9 * 3 + 9 * 9 + 9 * 7 + 9 * 3) % 10 = 2
 ^       ^
 |       └── 2. Ziffer
 └── 1. Ziffer
```

Dies ist eine fiktive Matrikelnummer, die der Berechnung genügt und ich habe
keine Informationen darüber, ob die Matrikelnummer schon von irgendwem verwendet
wird / wurde.