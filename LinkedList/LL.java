package Kunal.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }

    //Inserting new node at start
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }

        size += 1;
    }

    //Inserting new node at end
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //Inserting new node at particular index
    public void insert(int val,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;

        size++;
    }

    public int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    //Deleting from a particular index
    public int delete(int index){
        if (index == 0){
            return deleteFirst();//deleting first index
        }
        if (index == size-1){
            return deleteLast();//deleting last index
        }

        Node prev = get(index - 1);//previous value which is before index
        int val = prev.next.value;//value to be deleted
        prev.next = prev.next.next;//pointing to the node after the node which is being deleted
        return val;

    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public Node get(int index){
        Node node = head;
        for (int i=0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }


    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}
