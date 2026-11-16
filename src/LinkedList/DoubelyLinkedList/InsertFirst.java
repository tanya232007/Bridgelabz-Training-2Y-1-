package LinkedList.DoubelyLinkedList;

import LinkedList.Searching.DoubelyLinkedList;

public class InsertFirst {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    static Node head;
    static Node tail;

    public static void insertFirst(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        insertFirst(30);
        insertFirst(20);
        insertFirst(10);

        display();
    }
}
