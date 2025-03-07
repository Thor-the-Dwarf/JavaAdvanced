package _2_Java_Grundlagen._270_300;

public class _inArbeit_MethodenUndCo {

    static void gruessen(){
        System.out.println("Hallo Welt!");
    }

    static int addiere(int param1, int param2){
        int ergebnis = param1 + param2;
        return ergebnis;
    }

    static int addiere(int param2){
        int ergebnis = param2 + param2;
        return ergebnis;
    }

    static double addiere(int param1, double param2){
        double ergebnis = param1 + param2;
        return ergebnis;
    }


    public static void main(String[] args) {
        gruessen();
        int x = addiere(1,1);
        System.out.println(x);
        System.out.println(addiere(2,2));
        System.out.println(addiere(42));
        System.out.println(addiere(42, 1.2));
    }
}
