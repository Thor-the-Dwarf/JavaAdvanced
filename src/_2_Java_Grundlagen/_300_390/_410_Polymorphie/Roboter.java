package _2_Java_Grundlagen._300_390._410_Polymorphie;

public
class Roboter extends Maschiene {
    Roboter() {
        this.type = "Roboter";
    }

    public void move() {
        System.out.println(this + "beginnt programmierten bewegungsablauf");
    }
}


