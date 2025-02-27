package _2_Java_Grundlagen._270_300;//package _270_300;

public class _290_Equals {

    public static void main(String[] args) {

        // equals() zum Vergleichen von Strings
        // Überprüft immer die Werte
        // Nie den Vergleichoperator benutzen, da er nicht zuverlässig ist.

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);  // true
        System.out.println("Hello" == s2);  // true

        String ns2 = new String("Hello");
        String ns3 = new String("Hello");
        System.out.println(s1 == ns2);  // false
        System.out.println("s1" == ns2);  // false

        System.out.println("Hello".equals(ns2)); // true
        System.out.println("Hello".equals("Hello")); // true
        System.out.println(ns3.equals(ns3)); // true
//
//        String s3 = "hello";
//        System.out.println(s1 == s3);  // false
//
//        String s4 = "Hello";
//        String s5 = "World";
//        String s6 = s4 + s5;
//        String s7 = "HelloWorld";
//        System.out.println(s6 == s7);  // false  !!!!!
//
//        // equals()
//        System.out.println(s6.equals(s7));  // true
//        System.out.println("HelloWorld".equals(s7));  // true
//
    }
}
