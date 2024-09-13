package Kunal.JavaOOPS.interfaces.extendDemo;

public interface A {
    void fun();//abstract method

    //static interface method always have a body
    static void greeting(){
        System.out.println("Hey,I am a static method");
    }
}
