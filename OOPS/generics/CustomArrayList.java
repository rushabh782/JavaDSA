package Kunal.generics;

import java.util.ArrayList;

public class CustomArrayList {


    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;//also working as index value

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if (isFull()){
            resize();//creating temp(2x the size) arr, and storing all the items of current arr in temp arr along with new elements added
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];//creating temp arr which is double the size when arr is full

        //copy the current item in new arr
        for (int i=0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }





    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);

        for (int i=0; i < 14; i++){
            list.add(2 * i);
        }
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("dfghi");
    }
}
