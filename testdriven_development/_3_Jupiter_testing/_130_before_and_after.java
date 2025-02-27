package _3_Jupiter_testing;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) /// Erlaubt @BeforeAll und @AfterAll ohne "static"
class _130_before_and_after {

    private List<String> liste;

    /**
     * ✅ Wird EINMAL vor **allen Tests** ausgeführt.
     */
    @BeforeAll
    void beforeAll() {
        liste = new ArrayList<>();
        System.out.println("🚀 Test-Session beginnt!");
    }

    /**
     * ✅ Wird EINMAL nach **allen Tests** ausgeführt.
     */
    @AfterAll
    void afterAll() {
        System.out.println("🏁 Test-Session beendet!");
    }

    /**
     * ✅ Wird vor **jedem Test** ausgeführt.
     */
    @BeforeEach
    void bevorEach() {
        System.out.println("⚡ Vorher: Liste wird initialisiert.");
    }

    /**
     * ✅ Wird nach **jedem Test** ausgeführt.
     */
    @AfterEach
    void afterEach() {
        System.out.println("🛑 Nachher: Test abgeschlossen.");
    }

    /**
     * ✅ Einfacher Test
     */
    @Test
    void testStuff() {
        int summe = 2 + 3;
        assertEquals(5, summe, "");
        System.out.println("✅ testStuff wurde ausgeführt");
    }
    /**
     * ✅ Einfacher Test
     */
    @Test
    void testDifferentStuff() {
        int summe = 2 * 3;
        assertEquals(6, summe, "");
        System.out.println("✅ testDifferentStuff wurde ausgeführt");
    }
}

