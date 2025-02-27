package _2_Java_Grundlagen._210_260;

import java.util.ArrayList;
import java.util.Arrays;

public class _210_Wrapper {

    public static void main(String[] args) {

        // Wrapper-Klassen
        // Wrappen (umwickeln) die primitiven Datentypen
        // Es entstehen dabei Objekte
        // Brauchen mehr Speicherplatz als die primitiven Datentypen

        /*
        byte - Byte
        short - Short
        int - Integer       // Auch ausgeschrieben
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        char - Character    // Auch ausgeschrieben
         */


        Integer int1 = 777;
        Double dou1 = 1234567.8987654;
        Character char1 = 'Z';

        // ArrayList braucht die Wrappen-Klassen
        ArrayList<Integer> nums = new ArrayList<>();

        // Typen-Umwandlung per Methoden
        System.out.println(dou1.intValue());  // 1234567
        // System.out.println((int) dou1);  // incompatible types: java.lang.Double cannot be converted to int

        // Andere Methoden
        System.out.println(dou1.toString() + 3);  // 1234567.89876543
        System.out.println(dou1 + 3);             // 1234570.89876543
        System.out.println(dou1.toString().length());  // 15
        System.out.println(int1.toString().length());  // 3

        // Null als Default-Wert
        Double dou2 = null;
        System.out.println(dou2);  // null

        Double[] dou3 = new Double[3];
        System.out.println(Arrays.toString(dou3));  // [null, null, null]

        // Bei den primitiven Datentypen gibt es nicht null als Standard-Wert

        char[] dou4 = new char[3];
        System.out.println(Arrays.toString(dou4));  // [0.0, 0.0, 0.0]

        // double dou5 = null;  // incompatible types: <nulltype> cannot be converted to double

        // Primitive zu Wrapper
        double dou6 = 1234567;
        System.out.println(((Double) dou6).toString().length());  // 9

        System.out.println(Short.MIN_VALUE);  // -32768
        System.out.println(Float.MAX_VALUE);  // 3.4028235E38
        System.out.println(Double.MAX_VALUE);  // 1.7976931348623157E308

        // Autoboxing - unboxing
        // Aus int wird automatisch ein Integer gemacht und vice versa.


        // **********************************************************************************

        // == bei Wrapper-Objekten braucht ein IS-A Relationship
        Short k = 9;
        Integer i = 9;
        // System.out.println(k == i);
        // java: incomparable types: java.lang.Short and java.lang.Integer
        System.out.println();

        // Ein Primitive und ein Wrapper-Objekt kann man mit == vergleichen
        // Das Wrapper-Objekt wird impliziet unboxt
        Short k2 = 23;
        int i2 = 23;
        System.out.println(k2 == i2);  // true

        // Konstruktoren
        Integer i1 = new Integer("123");
        System.out.println(i1);  // 123

        // Es gibt nicht für jeden Datentyp einen Konstruktor:
        // Short s1 = new Short(12);  // java: no suitable constructor found for Short(int)


        // Kleine Werte sind die gleichen Objekte:
        // All the wrapper objects are immutable.
        // Java 'reuses' all the wrapper objects whose values fall in the following ranges:
        // All Boolean values (true and false)
        // All Byte values
        // All Character values from \u0000 to \u007f (i.e. 0 to 127 in decimal)
        // All Short and Integer values from -128 to 127
        // So == will always return true when their primitive values are the same
        // and belong to the above list of values.


    }
}
