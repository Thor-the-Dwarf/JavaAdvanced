package _3_Jupiter_testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import _3_Maven.Act_3_testing.Level_1_Jupiter._120_die_wichtigsten_asserts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * 📌 Testklasse für _120_die_wichtigsten_asserts.
 */
class _120_die_wichtigsten_assertsTest {

    private _120_die_wichtigsten_asserts testObjecct;

    @BeforeEach
    void setUp() {
        testObjecct = new _120_die_wichtigsten_asserts();
    }

    @Test
    void testAddiere() {
        assertEquals(5, testObjecct.addiere(2, 3));
        assertEquals(-1, testObjecct.addiere(-3, 2));
        assertEquals(0, testObjecct.addiere(0, 0));
    }

    @Test
    void testDividiere() {
        assertEquals(2, testObjecct.dividiere(6, 3));
        assertEquals(-2, testObjecct.dividiere(-6, 3));
        assertThrows(ArithmeticException.class, () -> testObjecct.dividiere(5, 0));
    }

    /**
     * ✅ Testet die Methode sayHello durch Umleitung der Systemausgabe.
     */
    @Test
    void testSayHello() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output)); // Systemausgabe umleiten

        testObjecct.sayHello(); // Methode aufrufen

        System.setOut(System.out); // Ausgabe zurücksetzen
        assertEquals("Hello World!\n", output.toString()); // Erwartete Ausgabe prüfen
    }

    /**
     * ✅ Testet, ob sayGoodBye eine IOException auslöst.
     */
    @Test
    void testThrowIOException() {
        assertThrows(IOException.class, () -> testObjecct.throwIOException());
    }
}

