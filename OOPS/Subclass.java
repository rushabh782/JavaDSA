package Kunal.JavaOOPS.singleton;

import Kunal.JavaOOPS.access.A;

public class Subclass extends A {

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(45,"Kubal Kushwaha");
    }
}
class SubClass2 extends A{

    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(45,"Kunal Kushwaha");
    }
}