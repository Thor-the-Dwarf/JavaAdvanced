package _2_Java_Grundlagen._170_200;

public class _180_Debugging {

    public static void main(String[] args) {

        // Debugging

        // Syntax Fehler   -> Da hilft die IDE
        // Runtime Fehler  -> Da helfen die Java-Fehlermeldungen
        // Logische Fehler -> Da kann der Debugger helfen

        int x = 1;
        int y = 7;
        int i;

        for (i = 0; i < 11; i++) {
            x++;
            y = x + 1;
        }

        x = 10;

        System.out.println(i + " - " + x + " - " + y);

    }
}
