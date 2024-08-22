package Kunal.JavaOOPS.Inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice(){
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l,double h, double w, double weight,double cost) {
        super(l, h, w, weight);//it will call the class above BoxPrice i.e - BoxWeight
        this.cost = cost;
    }


    public BoxPrice(double side,double weight,double cost){
        super(side,weight);//it will call the BoxWeight class
        this.cost = cost;
    }
}
