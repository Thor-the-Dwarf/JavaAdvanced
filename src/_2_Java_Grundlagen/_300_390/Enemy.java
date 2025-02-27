package _2_Java_Grundlagen._300_390;

public class Enemy {

    static int counter = 0;

    Enemy(){counter++;}

    public static void main(String[] args) {
        Enemy e1 = new Enemy();
        System.out.println(e1.counter);
        Enemy e2 = new Enemy();
        System.out.println(e1.counter);
        System.out.println(e2.counter);
    }
}
