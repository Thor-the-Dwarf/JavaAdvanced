package _2_Java_Grundlagen._270_300;

public class _275_MethodOverload {
    public static void main(String[] args) {

        System.out.println(addiere());
        System.out.println(addiere(42));
        System.out.println(addiere(42.0));
        System.out.println(addiere(42.0, 42));
        System.out.println(addiere(42, 42.0));
    }

    static int addiere() {
        System.out.println("addiere()");
        return 1 + 2;
    }

    static int addiere(int a) {
        System.out.println("addiere(int a)");
        return a + 2;
    }

    static double addiere(double a) {
        System.out.println("addiere(double a)");
        return a + 2;
    }

    static double addiere(double a, int b) {
        System.out.println("addiere(double a, int b)");
        return a + b;
    }

    static double addiere(int a, double b) {
        System.out.println("addiere(int a, double b)");
        return a + b;
    }
}
