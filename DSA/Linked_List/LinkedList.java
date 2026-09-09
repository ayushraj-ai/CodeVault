package Linked_List;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void addMiddle(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public int rmhead() {
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        int value = head.data;
        head = head.next;
        size--;

        if (size == 0) {
            tail = null;
        }

        return value;
    }

    public int rmtail() {
    if (size == 0) {
        return Integer.MIN_VALUE;
    }

    if (size == 1) {
        int value = head.data;
        head = tail = null;
        size = 0;
        return value;
    }

    Node prev = head;

    for (int i = 0; i < size - 2; i++) {
        prev = prev.next;
    }

    int value = tail.data;
    prev.next = null;
    tail = prev;
    size--;

    return value;
}

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
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

        ll.rmhead();
        ll.print();
        ll.rmtail();
        ll.print();
    }
}
