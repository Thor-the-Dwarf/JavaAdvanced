package _2_Java_Grundlagen._300_390._410_Polymorphie;

public class Androide extends Maschiene {
    Androide() {
        this.type = "Androide";
    }

    public void laufe() {
        System.out.println(this + "läuft ");
    }
}
