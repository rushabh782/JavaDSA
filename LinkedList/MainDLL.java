package Kunal.LinkedList;

public class MainDLL {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(45);

        list.insert(8,65);

        list.display();
    }
}
