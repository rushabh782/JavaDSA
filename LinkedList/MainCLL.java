package Kunal.LinkedList;

public class MainCLL {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.display();
        list.delete(19);

        list.display();
    }
}
