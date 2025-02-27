package _2_Java_Grundlagen._270_300;//package _270_300;

public class _280_ExceptionHandling {
    public static void main(String[] args) {


        int ergebnis = 10 / 0;
        System.out.println("Hier geht das Programm weiter");


//        System.out.println("Eine spezifische Exception auffangen");
        try {
            // Versuche, durch Null zu teilen, was eine ArithmeticException auslöst
//            int ergebnis = 10 / 0;
        } catch (ArithmeticException e) {
            // Diese Zeile wird ausgeführt, wenn eine ArithmeticException auftritt
            System.out.println("Fehler: Division durch Null ist nicht erlaubt!");
        }
//        System.out.println("Hier geht das Programm weiter");
//
//        System.out.println("Verwendung von Finally");
//        try {
////             Versuche, eine Datei zu öffnen, die möglicherweise nicht existiert, was eine FileNotFoundException auslösen könnte
//            java.io.FileReader datei = new java.io.FileReader("nicht_existierende_datei.txt");
//            java.io.BufferedReader reader = new java.io.BufferedReader(datei);
//            String inhalt = reader.readLine();
//            reader.close();
//        } catch (java.io.FileNotFoundException e) {
//            // Diese Zeile wird ausgeführt, wenn eine FileNotFoundException-Exception auftritt
//            System.out.println("Fehler: Datei wurde nicht gefunden.");
//            int ergebnis = 10 / 0;
//        }
//        catch (IOException e) {
//            // Diese Zeile wird ausgeführt, wenn ein IOException auftritt
//            System.out.println("Fehler beim Lesen der Datei.");
//        } finally {
//            // Diese Zeile wird immer ausgeführt, egal ob eine Exception aufgetreten ist oder nicht
//            System.out.println("Finally-Block wird immer ausgeführt.");
//        }
//        System.out.println("Hier geht das Programm weiter");
//
//        System.out.println("Alle Exceptions auffangen");
//        try {
//            // 1. ArithmeticException ähnlich dem ZeroDivisionError in Python
//            int ergebnis = 1 / 0;
//
//            // 2. FileNotFoundException ähnlich dem FileNotFoundError in Python
//            new FileReader("nicht_existierendes_file.txt");
//
//            // 3. NumberFormatException ähnlich dem ValueError in Python
//            Integer.parseInt("keineZahl");
//
//            // 4. IndexOutOfBoundsException ähnlich dem IndexError in Python
//            ArrayList<Integer> liste = new ArrayList<>();
//            liste.add(1);
//            liste.add(2);
//            liste.add(3);
//            int element = liste.get(5);
//
//            // 5. NullPointerException ähnlich dem AttributeError in Python
//            String nichts = null;
//            int laenge = nichts.length();
//
//        } catch (ArithmeticException e) {
//            System.out.println("Division durch Null.");
//        } catch (FileNotFoundException e) {
//            System.out.println("Datei nicht gefunden.");
//        } catch (NumberFormatException e) {
//            System.out.println("Ungültiger Wert.");
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Index außerhalb des Bereichs.");
//        } catch (NullPointerException e) {
//            System.out.println("Attribut existiert nicht.");
//        } catch (Exception e) {
//            System.out.println("Ein anderer Fehler ist aufgetreten: " + e.getMessage());
//        }
        /**
         * Weitere mögliche Exceptions:
         * - NameError: In Java führt der Versuch, auf eine nicht deklarierte Variable zuzugreifen, zu einem
         *      Compile-Zeitfehler, kein direktes Äquivalent.
         * - RuntimeError: In Java können ähnliche Fehler durch RuntimeExceptions abgedeckt werden.
         * - OverflowError: Java hat kein direktes Äquivalent; arithmetischer Überlauf verhält sich anders und
         *      löst nicht automatisch eine Exception aus.
         * - SyntaxError: Fehler im Quellcode, die in Java zu Compile-Zeitfehlern führen.
         * - IndentationError: In Java irrelevant, da Einrückungen nicht syntaxbestimmend sind; falsche Blockstruktur
         *      führt zu Compile-Zeitfehlern.
         * - AssertionError: Kann in Java mit assert-Anweisungen ausgelöst werden, wenn eine Bedingung falsch ist.
         * - KeyboardInterrupt: In Java nicht direkt vorhanden; Thread-Interruption kann für ähnliche Zwecke verwendet
         *      werden.
         * - MemoryError: In Java als OutOfMemoryError bekannt, wenn der JVM der Speicher ausgeht.
         * ... und viele mehr.
         *
         * Erklärung:
         * - "try": Block, in dem Code ausgeführt wird, der eine Exception auslösen könnte.
         * - "catch": Fängt eine bestimmte (oder alle) Exceptions auf, die im try-Block aufgetreten sind. In Java
         *      spezifiziert man den Typ der zu fangenden Exception.
         * - "finally": Block, der ausgeführt wird, nachdem die try- und catch-Blöcke abgearbeitet wurden, unabhängig
         *      davon, ob eine Exception aufgetreten ist oder nicht. Ideal für Aufräumarbeiten.
         * - In Java fängt man Exceptions mit "catch (ExceptionType e)", wobei "ExceptionType" der Typ der zu fangenden
         *      Exception ist und "e" eine Instanz dieser Exception darstellt, die zur Laufzeit erstellt wird.
         */

    }
}



