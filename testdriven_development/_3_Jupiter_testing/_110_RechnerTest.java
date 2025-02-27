package _3_Jupiter_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.testng.annotations.Test;
import _3_Maven.Act_3_testing.Level_1_Jupiter._110_Rechner;

/// TestKlassen-Namen müssen das Wort "test" enthalten. So will es die Schnittstelle
public class _110_RechnerTest {

    @Test
    void testAddiere() {
        _110_Rechner rechner = new _110_Rechner();
        int ergebnis = rechner.addiere(3, 2); // 3 + 2 = 5
        assertEquals(5, ergebnis, "Die Addition sollte 5 ergeben.");
    }

    /// Tests folgen immer dem Triple-A-Prinziep: Arange, Act, Assert
    @Test
    void Subtrahieretest() {

        /// Arrange (Vorbereiten)
        _110_Rechner rechner = new _110_Rechner();

        /// Act (Ausführen)
        int ergebnis = rechner.subtrahiere(5, 3); // erwartet Ergebis ist 8

        /// Assert (Überprüfen)
        assertEquals(2, ergebnis, "Die Subtraktion sollte 2 ergeben.");
        assertEquals(2, ergebnis, "Die Subtraktion sollte 2 ergeben.");
    }
}
