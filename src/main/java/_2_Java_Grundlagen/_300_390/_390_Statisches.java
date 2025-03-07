package _2_Java_Grundlagen._300_390;

class StaticVsInstance {

    /**
     * statisches gehört der Klasse
     */
    static String staticAttribute = "staticAttribute";

    static void staticMethod() {
        System.out.println("staticMethod");
//        this.staticAttribute = "this Funktioniert nicht im statischen Kontext"; // this zeigt auf ein Objekt
    }

    /**
     * nicht statisches gehört den Objekten / Instanzen
     */
    String objectAttribute = "objectAttribute";

    void objectMethod() {
        System.out.println("objectMethod");
    }
}

public class _390_Statisches {

    public static void main(String[] args) {

//        System.out.println("Statischer Aufruf auf statisches");
//        System.out.println(StaticVsInstance.staticAttribute);   // staticAttribute
//        StaticVsInstance.staticMethod();        // staticMethod

//        System.out.println("Versuch mit der Klasse auf Objektattribute zuzugreifen");
//        System.out.println(StaticVsInstance.objectAttribute);     // Fehler
//        StaticVsInstance.objectMethod();                          // Fehler

        System.out.println("Objekt / Instanz -Aufruf auf objektzugehöriges");
        StaticVsInstance object1 = new StaticVsInstance();
        System.out.println(object1.objectAttribute);      // objectAttribute
        object1.objectMethod();     // objectMethod

        System.out.println("Objekt / Instanz -Aufruf auf statisches");
        StaticVsInstance object2 = new StaticVsInstance();
        System.out.println(object1.staticAttribute);   // staticAttribute
        System.out.println(object2.staticAttribute);   // staticAttribute
        object1.staticMethod();        // staticMethod
        object2.staticMethod();        // staticMethod


    }

}
