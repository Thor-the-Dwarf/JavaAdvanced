package _2_Java_Grundlagen._210_260;

public class _220_TypeCasting {

    public static void main(String[] args) {

//        // Type-Casting  - Typen-Umwandlung
//
//        // Kleinerer Datentyp in größeren Container ist erlaubt
//        byte b1 = 100;
//        int int1 = b1;
//         int1 = (int) b1;  // Funktioniert, ist aber nicht nötig
//        System.out.println(int1);  // 100
//
//        // Größerer Datentyp geht nicht in einen kleineren Container
//        int int2 = 42;
////         byte b2 = int2;  // incompatible types: possible lossy conversion from int to byte
//
//        // Casting
//        // Datentyp in Klammern davor schreiben (explizites Type-Casting)
//        int int3 = 73;
//        byte b3 = (byte) int3;
//        System.out.println(b3);  // 73

        // Bei zu großen Werten gibt es einen Überlauf
        int int4 = 128;
        byte b4 = (byte) int4;
        System.out.println(b4);          // -128
        System.out.println((byte) 129);  // -127
        System.out.println((byte) 77777);  // -47

        // int <-> double
        int int5 = 78;
        double d5 = int5;    // Implizites Type-Casting (von Java)
        d5 = (double) int5;  // Funktioniert, ist aber nicht nötig
        System.out.println(d5);  // 78.0

        double d6 = 12345.6789;
        int int6 = (int) d6;
        System.out.println(int6);  // 12345

        // float
        float flo1 = 123;
        System.out.println(flo1);  // 123.0

        float flo2 = 123.45f;
        float flo3 = (float) 123.45;

        // Integer <-> String
        System.out.println("hier sind wir");
        int int7 = 12345;
        String str7 = Integer.toString(int7);
        System.out.println(str7);                             // 12345
        System.out.println(str7.getClass());                  // class java.lang.String
        System.out.println(str7.getClass().getSimpleName());  // String
        System.out.println(str7.length());                    // 5

        String str8 = "6789";
        System.out.println(str8 + 1);  // 67891
        // str8 = "6789";  // Nur zur Verdeutlichung
        int int8 = Integer.parseInt(str8);
        System.out.println(int8 + 1);  // 6790
        System.out.println(((Object) int8).getClass());  // class java.lang.Integer

        // Lost in casting
        int i = 1234567890;
        float f = i;
        System.out.println(i - (int) f);          // -46
        System.out.println(i - (int) (float) i);  // -46
        System.out.println(f);  // 1.23456794E9

        // All compound assignment operators internally do an explicit cast.
        byte b = 1;
        short s = 1;
        // s = b + b;  // java: incompatible types: possible lossy conversion from int to short
        // s = s + b;  // java: incompatible types: possible lossy conversion from int to short
        s += b;
        System.out.println(s);  // 2


        String str = "1";
        Integer strint = Integer.parseInt(str);
        System.out.println(strint.getClass());


    }
}
