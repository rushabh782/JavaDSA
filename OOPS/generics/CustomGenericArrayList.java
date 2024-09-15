package Kunal.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList<T> {


    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;//also working as index value

    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if (isFull()){
            resize();//creating temp(2x the size) arr, and storing all the items of current arr in temp arr along with new elements added
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];//creating temp arr which is double the size when arr is full

        //copy the current item in new arr
        for (int i=0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }


    @Override
    public String toString(){
        return "CustomerGenericArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }


    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        CustomGenericArrayList list = new CustomGenericArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);

//        for (int i=0; i < 14; i++){
//            list.add(2 * i);
//        }
//        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("dfghi");

        CustomGenericArrayList<Integer> list3 = new CustomGenericArrayList<>();
        for (int i=0; i < 14; i++){
        list3.add( 2 * i );
        }

        System.out.println(list3);
    }
}
