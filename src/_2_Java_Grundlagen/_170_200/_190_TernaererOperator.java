package _2_Java_Grundlagen._170_200;

import java.util.Random;

public class _190_TernaererOperator {

    public static void main(String[] args) {

        // Ternärer Operator - ternary operator
        // Conditional operator
        // Kurzform von if else
        // Drei Teile: bedingung ? true-Fall : false-Fall
        // Ternär, weil es drei Operanden gibt.

        Random r = new Random();
        int stunde = r.nextInt(24);
        System.out.println(stunde + ": ");
        String begruessung;
        // Per if else
        if (stunde > 18) {
            begruessung = "Guten Abend!";
        } else {
            begruessung = "Guten Tag!";
        }
        System.out.println(begruessung);

        // Per ternären Operator
        System.out.println(stunde > 18 ? "Guten Abend!" : "Guten Tag!");

        // Bitte nicht verschachteln
        String begruessung2 = stunde > 18
                ? stunde > 22
                ? "Gute Nacht!"
                : "Guten Tag!"
                : "Guten Tag!";
        System.out.println(begruessung2);  // z.B. Guten Tag!

        // Binäre Operatoren hat zwei Operanden (Player)
        System.out.println(7 == 8);

        // Unäre Operatoren hat einen Operanden
        System.out.println(-7);
        System.out.println(!true);
        int x = 0;
        System.out.println(++x);  // 1
        // System.out.println(not x);  // Python

        // Der Ternäre Operator erwartet einen Rückgabewert vom true- und vom false-Fall
        while (true) {
            // Math.random() < 0.5 ? break : continue;
            if (Math.random() < 0.5) break;
            else continue;
        }


    }
}
