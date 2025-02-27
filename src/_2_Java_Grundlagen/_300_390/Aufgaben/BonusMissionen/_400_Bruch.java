package _2_Java_Grundlagen._300_390.Aufgaben.BonusMissionen;

public class _400_Bruch {
    /*
     * Bruch
     *
     * Verwenden für die folgende Aufgabenstellung die unten stehende Klasse Bruch als Ausgangspunkt.
     *
     *     Ergänze die Klasse Bruch um drei Methoden:
     *
     *         - Bruch addiere(Bruch b)
     *         - Bruch subtrahiere(Bruch b)
     *         - double dezimalwert()
     *
     *     Die ersten beiden Methoden übernehmen als Argument einen Bruch,
     *     den sie zu dem Bruch hinzuaddieren,
     *     dessen addiere-Methode aufgerufen wird,
     *     bzw. den sie von dem Bruch abziehen,
     *     dessen subtrahiere-Methode aufgerufen wird.
     *     Achte darauf,
     *     dass die beiden Methoden das Ergebnis als neuen Bruch zurückliefern
     *     und dass die Attribute zaehler und nenner
     *     der beiden Ausgangsbrüche nicht verändert werden.
     *     Die Methode dezimalwert liefert den Wert des Bruchs
     *     als Kommazahl (double) zurück.
     */
}

class Bruch {

    private int zaehler;
    private int nenner;

    Bruch() {
        zaehler = 0;
        nenner = 1;
    }

    Bruch(int x) {
        zaehler = x;
        nenner = 1;
    }

    Bruch(int x, int y) {
        zaehler = x;
        nenner = y;
    }

    int getZaehler() {
        return zaehler;
    }

    int getNenner() {
        return nenner;
    }

    void setZaehler(int z) {
        zaehler = z;
    }

    void setNenner(int n) {
        nenner = n;
    }

    void ausgeben() {
        System.out.print(zaehler + "/" + nenner);
    }

    String bruchToString() {
        return zaehler + "/" + nenner;
    }

    void kuerzen() {
        double m = Math.abs(zaehler);
        double n = Math.abs(nenner);
        double r = m % n;
        while (r > 0) {  // Berechnung des ggT
            m = n;
            n = r;
            r = m % n;
        }
        zaehler /= n;  // in n steht jetzt der ggT
        nenner /= n;
    }

    void gekuerztausgeben() {
        kuerzen();
        ausgeben();
    }

    boolean equals(Bruch x) {
        Bruch a = new Bruch(this.zaehler, this.nenner);
        Bruch b = new Bruch(x.zaehler, x.nenner);
        a.kuerzen();
        b.kuerzen();
        if ((a.zaehler == b.zaehler) && (a.nenner == b.nenner)) {
            return true;
        } else {
            return false;
        }
    }
}
