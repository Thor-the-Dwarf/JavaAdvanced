package _3_Maven.Act_3_testing.Level_1_Jupiter;

public class _110_Rechner {
    /// diese speziellen Kommentare sind die Schnittstelle zur
    /// Test-Datei im test-Ordner


    /// nackter Test-Kommentar ohne Erklärung
    /**
     * @param a
     * @param b
     * @return
     */
    public int addiere(int a, int b) {
        return a + b;
    }

    ///  guter Test-Kommentar
    /**
     * Subtrahiert zwei ganze Zahlen.
     * @param a
     * @param b
     * @return Differenz von a und b
     */
    public int subtrahiere(int a, int b) {
        return a - b;
    }
}
