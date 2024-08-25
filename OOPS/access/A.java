package Kunal.JavaOOPS.access;

public class A {
    protected int num;
    String name;
    int[] arr;



    public int getNum(){       //Get Method
        return num;// accessible only in this class as num is declared as private
    }

    public void setNum(int num){     //Set Method
        this.num = num;
    }

    public A(int num,String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
