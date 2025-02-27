package _3_Jupiter_testing.Missionen._2_ProduktivKlassen_entwerfen;

import _3_Maven.Act_3_Jupiter_testing.Missionen._2_ProduktivKlassen_entwerfen.B170_LottoGenerator;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// todo schreibe die Produktivklasse A160_KmMeilenKonverter

public class A160_KmMeilenKonverterTest {

    private final B170_LottoGenerator generator = new B170_LottoGenerator();

    @RepeatedTest(100)
    void testLottoZahlenAnzahlTrue() {
//        Set<Integer> zahlen = generator.generiereZahlen();
//        assertEquals(6, zahlen.size(),
//                "[testLottoZahlenAnzahlTrue] expected: 6, actual: " + zahlen.size());
    }

    @RepeatedTest(100)
    void testLottoZahlenBereichTrue() {
//        Set<Integer> zahlen = generator.generiereZahlen();
//        assertTrue(zahlen.stream().allMatch(num -> num >= 1 && num <= 49),
//                "[testLottoZahlenBereichTrue] expected: alle Zahlen zwischen 1 und 49, actual: " + zahlen);
    }

    @RepeatedTest(100)
    void testLottoZahlenAnzahlFalse() {
    }

    @RepeatedTest(100)
    void testLottoZahlenBereichFalse() {
    }
}
