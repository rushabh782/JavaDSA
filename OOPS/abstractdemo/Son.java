package Kunal.abstractdemo;

public class Son extends Parent {

    public Son(int age){
        super(age);//calls the parent class
    }

    void normal(){
        super.normal();//overriding normal method from parent class
    }


    @Override
    void career() {
        System.out.println("I am going to be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Pepper pots");
    }
}
