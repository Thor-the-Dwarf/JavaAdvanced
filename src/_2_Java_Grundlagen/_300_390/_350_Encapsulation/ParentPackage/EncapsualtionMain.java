package _2_Java_Grundlagen._300_390._350_Encapsulation.ParentPackage;


//import org.example.java_advanced._2_Java_Grundlagen._300_390._350_Encapsulation.ChildPackage.Child;

import _2_Java_Grundlagen._300_390._350_Encapsulation.ChildPackage.Child;

public class EncapsualtionMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.getValues();

//        System.out.println(parent.public_);
//        System.out.println(parent.protected_);
//        System.out.println(parent.packagePrivate);
//        System.out.println(parent.private_);

        Child child = new Child();
        child.getValues();

//        System.out.println(child.public_);
//        System.out.println(child.protected_);
//        System.out.println(child.packagePrivate);
//        System.out.println(child.private_);
    }
}
