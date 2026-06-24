package Linked_List;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //create a new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        //Step 2
        newNode.next = head;

        //Step 3
        head = newNode;
    }

    public void addLast(int data){
        //Step 1  create node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        //Step 2
        tail.next = newNode;

        //step 3

        tail = newNode;

    }

    public void addMiddle(int index , int data){
        Node newNode = new Node(data);
        if(index == 0){
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while(i < index - 1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addLast(6);
        ll.print();
        ll.addMiddle(2,9 );
        ll.print();
    }
}
