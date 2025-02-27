package _2_Java_Grundlagen._270_300;//package _270_300;

public class _270_StatischeMethoden {
    public static void main(String[] args) {

        // Methode-Bezeichner
        // lowerCamelCase
        // Sprechender Bezeichner
        // Handlungsaufforderung -> Imperativ

        // Methoden können mehrmals ausgeführt werden
//        gibAus();  // "Ich bin in der Methode gibAus()!"
//        gibAus();  // "Ich bin in der Methode gibAus()!"
//        gibAus();  // "Ich bin in der Methode gibAus()!"
//
//        _270_StatischeMethoden.gibAus();  // "Ich bin in der Methode gibAus()!"
//
//        // Parameter
//        // Rückgabewert mit return
        int auffangen = addiere( 10,20);
//        int auffangen1 = addiere( 100,200);
//        System.out.println(auffangen);
//        System.out.println(auffangen1);
//        System.out.println(addiere(3, 4));  // 7
//
//        System.out.println(Math.PI);
//

    }

    static void gibAus() {
        System.out.println("Ich bin in der Methode gibAus()!");
    }

    static int addiere(int x, int y) {
        System.out.println("caller hat x übergeben. X ist:" + x);
        System.out.println("caller hat y übergeben. Y ist:" + y);
        int returnwert = x + y;
        return returnwert;
    }
}
