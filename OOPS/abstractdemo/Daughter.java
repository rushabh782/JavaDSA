package Kunal.abstractdemo;

public class Daughter extends Parent {

    public Daughter(int age){
        super(age);//calls the parent class
    }
    @Override
    void career() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Iron man");
    }
}
