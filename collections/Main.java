package Kunal.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(34);
        list2.add(38);
        list2.add(55);
        list2.add(98);

        System.out.println(list2);

        List<Integer> vector = new Vector<>();

        vector.add(13);
        vector.add(44);
        vector.add(80);
        vector.add(76);

        System.out.println(vector);
    }
}

