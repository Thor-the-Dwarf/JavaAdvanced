package _4_Jacoco_testing;

import _3_Maven.Act_4_Jacoco_testing.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    private final App app = new App();

    @Test
    public void testGreetWithName() {
        assertEquals("Hallo, Emma!", app.greet("Emma"));
    }

    @Test
    public void testGreetWithNull() {
        assertEquals("Hallo, Welt!", app.greet(null));
    }

    @Test
    public void testAdd() {
        assertEquals(5, app.add(2, 3));
    }
}
