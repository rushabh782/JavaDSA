package Kunal.JavaOOPS.interfaces.extendDemo;

public class Main implements B {


    @Override
    public void fun() {
        System.out.println("Ram is having fun playing cricket");
    }

    @Override
    public void greet() {
        System.out.println("All students are greeting their principal with respect");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();//call via interface name
    }
}
