package Kunal.JavaOOPS.Polymorphism;

//Every class extends Object class in Java
public class ObjectPrint extends Object {
    int num;

    public ObjectPrint(int num){
        this.num = num;
    }


    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);
    }
}
