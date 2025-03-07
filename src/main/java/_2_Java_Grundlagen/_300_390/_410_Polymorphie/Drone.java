package _2_Java_Grundlagen._300_390._410_Polymorphie;

public class Drone extends Roboter {
    Drone() {
        this.type = "Drone";
    }

    public void returnHome() {
        System.out.println(this + "kehrt heim");
    }
}
