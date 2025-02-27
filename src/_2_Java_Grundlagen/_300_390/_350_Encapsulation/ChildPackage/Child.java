package _2_Java_Grundlagen._300_390._350_Encapsulation.ChildPackage;


import _2_Java_Grundlagen._300_390._350_Encapsulation.ParentPackage.Parent;

public class Child extends Parent {

    public Child() {
        super();
        this.public_ = "Childs public";
        this.protected_ = "Childs protected";
//        this.packagePrivate = "Childs packagePrivate";
//        this.private_ = "Childs private";
    }
}
