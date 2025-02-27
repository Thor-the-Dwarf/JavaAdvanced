package _2_Java_Grundlagen._010_080;

public class _080_While {

    public static void main(String[] args) {


//        System.out.println("unendliche Schleife");
//        boolean b1 = 1==2;
//        while (b1) {
//            System.out.println(" läuft ");
//        }

//        System.out.println("while");
//        // Kopfgesteuerte Schleife
//        int i = 0;
//        while (i < 10) {
//            System.out.print(i + " ");
//            i++;
//        }
//        System.out.println();

//        System.out.println("verschachtelt");
//        // Kopfgesteuerte Schleife
        int j = 0;
        int k = 0;
        while (j < 5) {
            System.out.println("j = " + j + " ");
            j++;
            while (k < 5) {
                System.out.println("k = " + k + " ");
                k++;
            }
            System.out.println();
            k = 0;
        }
    }
}
