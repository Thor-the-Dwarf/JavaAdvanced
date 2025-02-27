package _2_Java_Grundlagen._010_080;

public class _010_JavaVersion {

    public static void main(String[] args) {

        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.version"));

    }
}

// Das ist ein einzeiliger Kommentar. Diese Zeile wird vom Programm nicht ausgeführt

/*
Das ist ein mehrzeiliger Kommentar.
Kommentare werden von Entwicklern benutzt, um ihr Programm zu erklären und vor allem auch selbst wieder zu
verstehen, wenn man nach Monaten zu seinem Programm zurückkehrt. "Was hab ich mir damals nur gedacht?"

Ein guter Kommentar erklärt: "Warum hab ich das genau so gemacht und nicht anders?"

Ein schlechter Kommentar erklärt: "Was tut das Programm an dieser Stelle"
    → das sollte jedoch aufgrund deines Skills lesbaren/wartbaren Code zu schreiben selbsterklärend sein

Im Rahmen der Schulung werden wir folglich nur schlechte Kommentare schreiben, um den Code zu erklären.
Gewöhnt euch das nicht an!
*/

/**
 * Das ist ein Dangling (Unverbindlicher) -Kommentar oder auch Entwicklerkommentar.
 * Entwicklerkommentare kommen bei umfangreichem Code zum Einsatz.
 * Sie schaffen einen Überblick darüber:
 * - was der Code tun soll
 * - Wie er sich verhält
 * - was er braucht
 * - was er returned
 */