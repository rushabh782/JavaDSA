package Kunal.abstractdemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);//object created, constructor is called
        son.career();

        son.normal();

        Daughter daughter = new Daughter(20);
        daughter.career();

        Parent.hello();//static method called

    }
}
