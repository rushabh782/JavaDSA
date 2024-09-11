package Kunal.abstractdemo;

public abstract class Parent {
    int age;
    final int VALUE;


    public Parent(int age) {
        this.age = age;
        VALUE = 32456789;
    }

    static void hello(){
        System.out.println("hey");//static method can be created in abstract class
    }

    void normal(){
        System.out.println("This is normal method");
    }

    abstract void career();//method's body is defined in child class in absraction
    abstract void partner();
}
