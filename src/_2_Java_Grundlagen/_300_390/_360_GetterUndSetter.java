package _2_Java_Grundlagen._300_390;

class Car {
    private int maxSpeed;

    Car() {
        this.maxSpeed = 160;
    }

    public int getMaxSpeed() {
        // todo Informiere Admin: "ActiveUser" hat diesen Getter benutzt.
        return this.maxSpeed;
    }

    public void setMaxSpeed(int value) {
        if (value > 0) {
            this.maxSpeed = value;
            System.out.println("maxSpeed ist nun: " + this.maxSpeed);
        } else
            System.err.println("maxSpeed muss größer als 0 sein!");
    }

}


public class _360_GetterUndSetter {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("nutzung des Getters");
        int speed = car.getMaxSpeed();
        System.out.println("Höchstgeschwindigkeit ist: " + speed);
        System.out.println(car.getMaxSpeed());


        System.out.println("Nutzung des Setters");
        car.setMaxSpeed(250);
        speed = car.getMaxSpeed();
        System.out.println("Höchstgeschwindigkeit ist: " + speed);


        System.out.println("Andere Nutzung des Setters");
        car.setMaxSpeed(-250);
        speed = car.getMaxSpeed();
        System.out.println("Höchstgeschwindigkeit ist: " + speed);


    }
}
