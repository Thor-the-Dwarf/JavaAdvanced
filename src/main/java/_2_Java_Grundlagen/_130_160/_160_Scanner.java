package _2_Java_Grundlagen._130_160;

import java.util.Scanner;

public class _160_Scanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Bitte einen String eingeben: ");
//        String str1 = sc.nextLine();
//        System.out.println(str1);

//        System.out.println("Bitte eine Fließkommazahl eingeben: ");  // 7,8
//        double dou = sc.nextDouble();
//        System.out.println(dou);  // 7.8
//
        System.out.println("Bitte eine Ganzzahl eingeben: ");  // 100
        int int1 = sc.nextInt();
        System.out.println(int1);  // 100

        sc.close();
    }
}
