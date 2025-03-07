package _3_Maven.Act_4_Jacoco_testing;

public class App {
    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hallo, Welt!";
        }
        return "Hallo, " + name + "!";
    }

    public int add(int a, int b) {
        return a + b;
    }
}
