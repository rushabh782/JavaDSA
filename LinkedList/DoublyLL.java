package Kunal.LinkedList;

public class DoublyLL {

    private Node head;

    //inserting node at beginning of Doubly LinkedList
    public void insertFirst(int val){
        Node node = new Node(val);//current node's value
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;//setting new node as head
    }

    public void display(){
        Node node = head;
        Node last = null;
        while (node != null){
            System.out.print(node.val + "-> ");
            last = node;//it is pointing to the last node
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    //inserting node at end of Doubly LinkedList
    public void insertLast(int val){
        Node node = new Node(val);//creating a node with val in it
        Node last = head;

        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //inserting node after particular value in  Doubly LinkedList
    public void insert(int after ,int val){
        Node p = find(after);//finding node after which the newNode has to be added(prev node)

        if (p == null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);//creating a node
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }

    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
