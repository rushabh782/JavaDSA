package Kunal.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12,89.76f);
        Student rahul = new Student(5,99.67f);
        Student arpit = new Student(2,95.67f);
        Student karan = new Student(13,77.67f);
        Student sachin = new Student(9,96.67f);

        Student[] list = {kunal,rahul,arpit,karan,sachin};
        System.out.println(Arrays.toString(list));


        if (kunal.compareTo(rahul) < 0){
            System.out.println("Rahul has more marks than kunal");
        }
    }
}
