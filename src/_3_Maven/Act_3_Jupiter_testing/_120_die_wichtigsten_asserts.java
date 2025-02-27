package _3_Maven.Act_3_Jupiter_testing;

import java.io.IOException;

/**
 * 📌 Die Klasse SimpleMath stellt grundlegende mathematische Methoden bereit.
 */
public class _120_die_wichtigsten_asserts {

    /**
     * ✅ Addiert zwei ganze Zahlen.
     * @param a Erste Zahl
     * @param b Zweite Zahl
     * @return Summe von a und b.
     */
    public int addiere(int a, int b) {
        return a + b;
    }

    /**
     * ✅ Führt eine Division durch.
     * @param a Dividend
     * @param b Divisor (darf nicht 0 sein)
     * @return Der Quotient von a und b.
     * @throws ArithmeticException Falls b = 0 ist.
     */
    public int dividiere(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("❌ Division durch Null ist nicht erlaubt!");
        }
        return a / b;
    }

    /**
     * ✅ Testet die Konsolenausgabe "Hello World!".
     * ➡️ Erwartet wird die Ausgabe: "Hello World!"
     */
    public void sayHello() {
        System.out.println("Hello World!");
    }


    /**
     * ✅ Testet das Werfen einer IOException.
     * ➡️ Erwartet wird eine IOException mit der Nachricht: "da ist wohl was schief gelaufen".
     * @throws IOException Falls ein Fehler auftritt.
     */
    public void throwIOException() throws IOException{
        throw new IOException("da ist wohl was schief gelaufen");
    }

}



