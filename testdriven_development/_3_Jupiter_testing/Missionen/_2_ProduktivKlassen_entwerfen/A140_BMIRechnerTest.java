package _3_Jupiter_testing.Missionen._2_ProduktivKlassen_entwerfen;


import _3_Maven.Act_3_Jupiter_testing.Missionen._2_ProduktivKlassen_entwerfen.A140_BMIRechner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// todo schreibe die Produktivklasse A140_BMIRechner


class A140_BMIRechnerTest {

    private final A140_BMIRechner bmiRechner = new A140_BMIRechner();

    @Test
    void testBMIBerechnungTrue() {
//        assertEquals(22.22, bmiRechner.berechneBMI(70, 1.78), 0.01,
//                "[testBMIBerechnungTrue] expected: ~22.22, actual: BMI für 70kg & 1.78m");
    }

    @Test
    void testBMIBerechnungFalse() {
//        assertEquals(25.00, bmiRechner.berechneBMI(70, 1.78), 0.01,
//                "[testBMIBerechnungFalse] expected: 25.00, actual: BMI für 70kg & 1.78m");
    }
}
