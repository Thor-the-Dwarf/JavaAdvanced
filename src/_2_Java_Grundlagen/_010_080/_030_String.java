package _2_Java_Grundlagen._010_080;

public class _030_String {

    public static void main(String[] args) {

        // String - Zeichenkette
        // Objekt einer Klasse -> Datentyp großgeschrieben
        // Reference type
        // Doppelte Anführungszeichen
        // unveränderbar - immutable

        String text1 = "Hello";
//        System.out.println(text1);

        String text2 = new String("So gehts auch");
//        System.out.println(text2);
//
//        System.out.println("String Verkettung - Konkatenation");
//        System.out.println(text1 + text2);
//        System.out.println(text1 + " " + text2);
//        System.out.println("Hallo" + " " + "Welt!");
//
//        System.out.println("String Verkettung mit anderen Datentypen");
//        System.out.println(42 + 42 + text1 + 21 + 21);
//        System.out.println(42 + 42 + text1 + 21 + (21 + 'A'));
//        System.out.println(true + text1 + false);
//        System.out.println(null + text1 + null);
//
        System.out.println("Escape Sequenzen");

        System.out.println("Zeilenumbruch");
        System.out.println("Hello\nWorld");

        System.out.println("Tabulator");
        System.out.println("Hello\tWorld");

        System.out.println("Anführungszeichen in einem String");
        System.out.println("She said, \"Hello!\"");

        System.out.println("Backslash");
        System.out.println("Das ist ein backslash: \\");

        System.out.println("Unicode-Zeichen");
        System.out.println("\u0395");


    }
}