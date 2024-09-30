package Kunal.LinkedList;

public class CircularLL {
    private Node head;
    private Node tail;

    public CircularLL(){
        this.head = null;
        this.tail = null;
    }

    //Insertion in circular LinkedList
    public void insert(int val){
        Node node = new Node(val);//creating a node to store the value
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    //Display the circular LinkedList
    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            }while(node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val){
        Node node = head;
        if (node == null){
            return;
        }
        //base condition when 1st node is to be deleted
        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }
        //General condition for deleting node
        do {
            Node n = node.next;
            if (n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);
    }

    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
}
