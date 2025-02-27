package _2_Java_Grundlagen._300_390._410_Polymorphie;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Maschiene maschiene1 = new Maschiene();
        Roboter roboter1 = new Roboter();
        Drone drone1 = new Drone();
        Androide androide1 = new Androide();

        // Maschiene als Container
        Maschiene roboter2 = new Roboter();
        Maschiene drone2 = new Drone();
        Maschiene androide2 = new Androide();

//        // Roboter als Container
//        Roboter maschiene3 = new Maschiene();   // class Cast Error
        Roboter drone3 = new Drone();
//        Roboter androide3 = new Androide();     // class Cast Error
//
//        // Drone als Container
//        Drone maschiene4 = new Maschiene();     // class Cast Error
//        Drone drone4 = new Roboter();           // class Cast Error
//        Drone androide4 = new Androide();       // class Cast Error
//
//        // Androide als Container
//        Androide maschiene5 = new Maschiene();     // class Cast Error
//        Androide roboter5 = new Roboter();           // class Cast Error
//        Androide drone5 = new Drone();       // class Cast Error

        ArrayList<Maschiene> maschienen = new ArrayList<>();
        maschienen.add(maschiene1);
        maschienen.add(roboter1);
        maschienen.add(drone1);
        maschienen.add(androide1);
        maschienen.add(roboter2);
        maschienen.add(drone2);
        maschienen.add(androide2);
        maschienen.add(drone3);
        maschienen.add(new Maschiene());
        maschienen.add(new Roboter());
        maschienen.add(new Drone());
        maschienen.add(new Androide());

        for (Maschiene m : maschienen) {
            m.setActiv(true);
            System.out.println(m);
        }

        ArrayList<Object> objekte = new ArrayList<>();
        objekte.add("String");
        objekte.add(true);
        objekte.add(17);
        objekte.add(17.64);
        objekte.add(new Random());
        objekte.add(new String());


        for (Object m : objekte) {
            System.out.println(m);
        }

    }
}
