package _2_Java_Grundlagen._130_160;

import java.util.Arrays;
import java.util.Locale;

public class _150_StringMethoden {

    public static void main(String[] args) {

        // String-Methoden

        // https://www.w3schools.com/java/java_ref_string.asp
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html

        String text = "ABCDEFG";

        // length() - Methode
        System.out.println(text.length());  // 7

        // toLowerCase() - toUpperCase()
        String s1 = "Hello World";
        System.out.println(s1.toLowerCase());  // hello world
        System.out.println(s1.toUpperCase());  // HELLO WORLD

        Locale locale_tr = new Locale("tr", "TR");
        System.out.println("illusion".toUpperCase(locale_tr));  // İLLUSİON
        System.out.println("ILLUSION".toLowerCase(locale_tr));  // ıllusıon

        // concat()
        String vorname = "Peter";
        String nachname = "Wellert";
        System.out.println(vorname.concat(nachname));  // PeterWellert
        // Chaining von Methoden
        System.out.println(vorname.concat(" ").concat(nachname));  // Peter Wellert
        System.out.println(vorname + " " + nachname);              // Peter Wellert

        // trim()
        // Entfernt die Whitespaces am Anfang und am Ende eines Strings
        // Whitespaces: Leerzeichen, Tabulatoren (\t), Zeilenumbrüche (\n)
        System.out.println("---" + "   Hello World   ".trim() + "---");          // ---Hello---
        System.out.println("---" + "   \t\tHello World   ".trim() + "---");      // ---Hello---
        System.out.println("---" + "   \n\n\t\tHello World  ".trim() + "---");  // ---Hello---

        // indexOf(string|char)
        // Gibt den Index des ersten Treffers zurück.
        vorname = "Peter";
        System.out.println(vorname.indexOf("t"));  // 2
        System.out.println(vorname.indexOf('e'));  // 1
        // Einen längeren String in einem String suchen
        text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(text.indexOf("MNO"));  // 12
        System.out.println(text.indexOf("M") + " " + text.indexOf("N") + " " + text.indexOf("O"));  // 12 13 14
        // Wenn der String nicht gefunden wird:
        System.out.println(text.indexOf("123"));  // -1

        // substring(index)
        // index ist der Anfang und ist inklusiv.
        // Schneidet vom index bis zum Ende
        // Ende ist nicht angegeben und daher auch inklusiv.
        vorname = "Peter";
        System.out.println(vorname.substring(2));  // ter

        // substring(anfang, ende)
        // anfang inklusiv und ende exklusiv
        text = "0123456789";
        System.out.println(text.substring(2, 7));  // 23456
        String satz = "Heute ist Mittwoch.";
        System.out.println(satz.substring(2, 7));  // ute i

        // char charAt(index)
        satz = "Heute ist Mittwoch.";
        char zeichen = satz.charAt(10);
        System.out.println(zeichen);  // M
        // System.out.println("Hello".charAt(10));  // StringIndexOutOfBoundsException
        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#charAt-int-
        // Offiziel soll sie eine IndexOutOfBoundsException werfen.
        String vieleZiffern = "0123456789012345678901234567890123456789012345678901234567890123456789";
        System.out.println(vieleZiffern.charAt('A'));  // 5

        // split(str)
        // Wandelt einen String in ein String-Array um.
        satz = "Heute ist Mittwoch.";
        String[] satzArr = satz.split(" ");
        System.out.println(Arrays.toString(satzArr));  // [Heute, ist, Mittwoch.]

        // System.out.println(satz.substring(2, 27));  // StringIndexOutOfBoundsException

        // str1.compaerTo(str2)
        // Subtrahiert die Integer(ASCII)-Werte
        System.out.println("Hello".compareTo("Hello"));  // 0   (72 - 72)
        System.out.println("Hello".compareTo("Igel"));   // -1  (72 - 73)
        System.out.println("Hello".compareTo("Jakob"));  // -2  (72 - 74)
        System.out.println("Hello".compareTo("hello"));  // -32 (72 - 104)
        System.out.println("Igel".compareTo("Hello"));   // 1   (73 - 72)
        System.out.println("Hello".compareTo("Hallo"));  // 4  (101 - 97)
        System.out.println("Hello".compareTo("Hell"));   // 1
        System.out.println("Hello".compareTo("He"));     // 3

        // Nicht destruktive Methoden
        String str1 = "Hello";
        str1.toLowerCase();
        System.out.println(str1);  // Hello
        String str2 = str1.toLowerCase();
        System.out.println(str2);  // hello
        str1 = str1.toLowerCase();
        System.out.println(str1);  // hello

        // replace(CharSequence target, CharSequence replacement)
        // Ersetzt auch ALLE Vorkommnisse
        // Kann aber NICHT mit Regex umgehen
        String text2 = "Hello World!";
        System.out.println(text2.replace("l", "X"));  // HeXXo WorXd!
        String text3 = "Hello Hello World!";
        System.out.println(text3.replace("Hello", "World"));  // World World World!
        String text6 = "Hello 1234 World!";
        System.out.println(text6.replace("[0-9]", "X"));  // Hello 1234 World!

        // Wenn target gleich replacement bei char
        // String replace(char oldChar, char newChar)
        System.out.println("Hello".replace('H', 'H') == "Hello");  // true
        // Geht nicht mit Strings:
        System.out.println("Hello".replace("H", "H") == "Hello");  // false

        // replaceAll() kann auch Regex
        String text4 = "Hello Hello World!";
        System.out.println(text4.replaceAll("Hello", "World"));  // World World World!

        String text5 = "Hello 1234 World!";
        System.out.println(text5.replaceAll("[0-9]", "X"));  // Hello XXXX World!

        // replaceFirst()
        String text7 = "Hello 1234 World!";
        System.out.println(text7.replaceFirst("[0-9]", "X"));  // Hello X234 World!

        // intern()
        // The method intern() creates an exact copy of a String object in the heap memory
        // and stores it in the String constant pool.
        // Note that, if another String with the same contents exists in the String constant pool,
        // then a new object won't be created and the new reference will point to the other String.
        String text8 = "Hellooo";
        System.out.println(text8.intern());           // Hellooo
        String text9 = new String("Hellooo");
        System.out.println(text8 == text9);           // false
        String text10 = text9.intern();
        System.out.println(text8 == text10);          // true
        System.out.println(text8 == text9.intern());  // true


    }
}
