package _3_Jupiter_testing.Missionen._2_ProduktivKlassen_entwerfen;

import _3_Maven.Act_3_Jupiter_testing.Missionen._2_ProduktivKlassen_entwerfen.A150_Bankkonto;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

// todo schreibe die Produktivklasse A150_Bankkonto

class A150_BankkontoTest {

    private final A150_Bankkonto konto = new A150_Bankkonto();

    @Test
    void testEinzahlenTrue() {
//        konto.einzahlen(100);
//        assertEquals(100, konto.getKontostand(),
//                "[testEinzahlenTrue] expected: 100, actual: Kontostand nach Einzahlung von 100");
    }

    @Test
    void testAbhebenTrue() {
//        konto.einzahlen(200);
//        assertTrue(konto.abheben(50),
//                "[testAbhebenTrue] expected: true, actual: Abhebung von 50 erfolgreich");
    }

    @Test
    void testAbhebenFalse() {
//        konto.einzahlen(50);
//        assertFalse(konto.abheben(100),
//                "[testAbhebenFalse] expected: false, actual: Abhebung von 100 nicht möglich");
    }

    @Test
    void testKontostandTrue() {
//        konto.einzahlen(300);
//        assertEquals(300, konto.getKontostand(),
//                "[testKontostandTrue] expected: 300, actual: Kontostand nach Einzahlung von 300");
    }

    @Test
    void testKontostandFalse() {
//        konto.einzahlen(300);
//        assertEquals(100, konto.getKontostand(),
//                "[testKontostandFalse] expected: 100, actual: Kontostand nach Einzahlung von 300");
    }
}
