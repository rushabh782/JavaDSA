package Kunal.JavaOOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//
//        System.out.println(box.l + " "+box.w+" "+box.h);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2,3,4,8);
        System.out.println(box3.h+ " " + box3.weight);

        Box box5 = new BoxWeight(2,3,4,8);
        System.out.println(box5.w);

        BoxPrice box = new BoxPrice();

    }
}
