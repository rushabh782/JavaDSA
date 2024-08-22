package Kunal.JavaOOPS.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }


    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
    public BoxWeight(double l,double h, double w,double weight){
        super(l,h,w);//what is this? call the parent class constructor
        //super() - used to initialise values present in the parent class
        this.weight = weight;
    }



}
