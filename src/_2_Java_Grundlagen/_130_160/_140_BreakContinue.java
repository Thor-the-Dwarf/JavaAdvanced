package _2_Java_Grundlagen._130_160;

public class _140_BreakContinue {

    public static void main(String[] args) {






        System.out.println("'break' beendet die Schleife");
        System.out.println("'continue' startet eine neue Iteration");

        System.out.println("break in for-Schleife");
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("continue in for-Schleife");
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("break in while-Schleife");
        int i = 0;
        while (i < 5) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
            i++;
        }

        System.out.println("continue in while-Schleife");
        i = 0;
        while (i < 5) {
            if (i == 3) {
                i++; // Wichtig: Erhöhe i vor continue, um eine Endlosschleife zu vermeiden
                continue;
            }
            System.out.println(i);
            i++;
        }

        System.out.println("break in do-while-Schleife");
        int j = 0;
        do {
            if (j == 3) {
                break;
            }
            System.out.println(j);
            i++;
        } while (j < 5);

        System.out.println("continue in do-while-Schleife");
        j = 0;
        do {
            if (j == 3) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        } while (j < 5);


    }
}

