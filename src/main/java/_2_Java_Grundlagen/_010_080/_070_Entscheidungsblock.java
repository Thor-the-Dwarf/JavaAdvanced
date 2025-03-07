package _2_Java_Grundlagen._010_080;

public class _070_Entscheidungsblock {

    public static void main(String[] args) {

//        System.out.println("if");
//        if (true) {
//            System.out.println("diese Zeile wird nur ausgeführt wenn die Bedingung 'true' ist");
//        }

        int x = 42;
//        System.out.println("if-else");
        boolean bol1 = 1==1;
        if (bol1) {
            System.out.println("x == 7");
        } else {
            System.out.println("x == 11");
        }
//
//
        System.out.println("if-elif-else");
        if (x == 7) { // WENN
            System.out.println("x == 7");
        }

        else if (x == 11) { // SONST WENN
            System.out.println("x == 11");
        } else if (x == 17) { // SONST WENN
            System.out.println("x == 17");
        } else { // SONST
            System.out.println("In x ist keine 7 oder 11 oder 17!");
        }
////
//        x = 11;
//        System.out.println("Verschachteln");
        if (x != 7) {
            if (x != 11) {
                if (x != 17) {
                    System.out.println("In x ist keine 7 oder 11 oder 17!");
                } else {
                    System.out.println("if x != 17 ist false");
                }
            } else {
                System.out.println("x != 11 ist false");
            }
        } else {
            System.out.println("x != 7 ist false");
        }

    }
}
