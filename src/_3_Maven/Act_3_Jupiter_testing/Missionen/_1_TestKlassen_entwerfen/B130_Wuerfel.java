package _3_Maven.Act_3_Jupiter_testing.Missionen._1_TestKlassen_entwerfen;

import java.util.Random;

public class B130_Wuerfel {
    private final Random random = new Random();

    public int werfen() {
        return random.nextInt(6) + 1; // Zahlen 1 bis 6
    }
}
