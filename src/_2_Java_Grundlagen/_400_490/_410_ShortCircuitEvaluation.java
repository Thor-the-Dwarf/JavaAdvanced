package _2_Java_Grundlagen._400_490;

public class _410_ShortCircuitEvaluation {

//    static boolean test() {
//        System.out.println("Test");
//        return true;
//    }

    public static void main(String[] args) {

        // Short-circuit evaluation bei &&, ||

        // *********************************************************
        // Short-circuit evaluation bei &&
        // *********************************************************
        int eins = 0, zwei = 0;

        if (((eins = eins + 1) == 0) && ((zwei = zwei + 1) == 0)) {}

        System.out.println(eins + " " + zwei);

        // *********************************************************
        //  evaluation bei &
        // *********************************************************
        eins = 0; zwei = 0;

        if (((eins = eins + 1) == 0) & ((zwei = zwei + 1) == 0)) {}

        System.out.println(eins + " " + zwei);

    }

}
