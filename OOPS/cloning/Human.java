package Kunal.JavaOOPS.cloning;

//Cloneable -> It is the interface in java.lang package
public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    public Human(int age,String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 9};
    }

    //Shallow copy- twin obj  points to the same kunal object
//    public Object clone() throws CloneNotSupportedException{
//        //this is shallow copy
//        return super.clone();
//    }

    //Deep copy - it creates different copy of the objects(different copy of then kunal obj is created
    @Override
    public Object clone() throws CloneNotSupportedException{
        //this is deep copy
        Human twin = (Human) super.clone();//this is actually shallow copy

        //make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i=0; i < twin.arr.length;i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
