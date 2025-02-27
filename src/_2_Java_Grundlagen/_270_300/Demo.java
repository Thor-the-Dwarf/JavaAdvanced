package _2_Java_Grundlagen._270_300;

public class Demo extends Test{

    static{
        System.out.println("Demo: static Initializer wurde ausgeführt");
    }
    {
        System.out.println("Demo: Initializer wurde ausgeführt");
    }


    Demo(){
        super();
        System.out.println("Demo: Konstruktor wurde ausgeführt");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        Demo d1 = new Demo();
    }
}


class Test{

    static{
        System.out.println("Test: static Initializer wurde ausgeführt");
    }
    {
        System.out.println("Test: Initializer wurde ausgeführt");
    }


    Test(){
        System.out.println("Test: Konstruktor wurde ausgeführt");
    }
}
