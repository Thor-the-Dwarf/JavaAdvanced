package _2_Java_Grundlagen._300_390._350_Encapsulation.ParentPackage;

public class Parent {
    public String public_ = "Parents public";
    protected String protected_ = "Parents protected";
    String packagePrivate = "Parents packagePrivate";
    private String private_ = "Parents private";

    public void getValues() {
        System.out.println("Parents getValues called");
        System.out.println(this.public_);
        System.out.println(this.protected_);
        System.out.println(this.packagePrivate);
        System.out.println(this.private_);
    }

}
