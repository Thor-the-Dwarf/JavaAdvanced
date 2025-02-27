package _3_Maven.Act_3_Jupiter_testing.Missionen._1_TestKlassen_entwerfen;

public class A100_Rechner {
    public int addiere(int a, int b) {
        return a + b;
    }

    public int subtrahiere(int a, int b) {
        return a - b;
    }

    public int multipliziere(int a, int b) {
        return a * b;
    }

    public int dividiere(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division durch Null ist nicht erlaubt!");
        }
        return a / b;
    }
}
