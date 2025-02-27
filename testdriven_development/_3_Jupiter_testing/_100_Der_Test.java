package _3_Jupiter_testing;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class _100_Der_Test {

    private ArrayList<String> liste;

    /**
     * ✅ Wird vor jedem Test ausgeführt, um `liste` zu initialisieren.
     */
    @BeforeEach
    void setUp() {
        liste = new ArrayList<>(); // Initialisiert `liste` vor jedem Test
    }


    /**
     * ✅ Einfacher Test mit `assertEquals`
     */
    @Test
    void testAdd() {
        int summe = 2 + 3;
        assertEquals(5, summe, "Addition sollte 5 ergeben");
    }

    /**
     * ✅ Test mit `assertNotNull`
     */
    @Test
    void testNotNull() {
        String text = "JUnit";
        assertNotNull(text, "String sollte nicht null sein");
    }

    /**
     * ✅ Exception-Test mit `assertThrows`
     */
    @Test
    void testException() {
        assertThrows(ArithmeticException.class, () -> {
            int ergebnis = 10 / 0;
        }, "Sollte eine Division durch Null auslösen");
    }

    /**
     * ✅ Test, ob KEINE Exception geworfen wird (`assertDoesNotThrow`)
     */
    @Test
    void testNoException() {
        assertDoesNotThrow(() -> {
            int ergebnis = 10 / 2;
        }, "Sollte KEINE Exception werfen");
    }

    /**
     * ✅ `@Nested`: Gruppierte Tests
     */
    @Nested
    class ListenTests {

        @Test
        void testListEmpty() {
            assertTrue(liste.isEmpty(), "Liste sollte leer sein");
        }

        @Test
        void testAddElement() {
            liste.add("Hallo");
            assertFalse(liste.isEmpty(), "Liste sollte nicht mehr leer sein");
            assertEquals(1, liste.size(), "Liste sollte 1 Element enthalten");
        }
    }

    /**
     * ✅ `@RepeatedTest`: Wiederholte Tests
     */
    @RepeatedTest(3)
    void testRepeated(RepetitionInfo repetitionInfo) {
        System.out.println("🔁 Wiederholung " + repetitionInfo.getCurrentRepetition() + " von " + repetitionInfo.getTotalRepetitions());
        liste.add("Wert");
        assertFalse(liste.isEmpty());
    }

    /**
     * ✅ `@EnabledOnOs`: Bedingter Test (Nur auf Windows)
     */
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testOnlyOnWindows() {
        System.out.println("🔵 Dieser Test läuft nur unter Windows.");
        assertTrue(System.getProperty("os.name").toLowerCase().contains("win"));
    }

    /**
     * ✅ Test nur auf **Mac**
     */
    @Test
    @EnabledOnOs(OS.MAC)
    void testOnlyOnMac() {
        System.out.println("🍏 Dieser Test läuft nur auf macOS.");
        assertTrue(System.getProperty("os.name").toLowerCase().contains("mac"));
    }

}
