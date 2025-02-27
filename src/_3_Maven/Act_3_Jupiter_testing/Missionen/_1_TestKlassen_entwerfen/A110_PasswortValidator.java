package _3_Maven.Act_3_Jupiter_testing.Missionen._1_TestKlassen_entwerfen;

public class A110_PasswortValidator {
    public boolean istGueltig(String passwort) {
        return passwort.length() >= 8 &&
                passwort.matches(".*\\d.*") &&
                passwort.matches(".*[!@#$%^&*()].*");
    }
}

