package LinkedList.Searching;

public class DoubelyLinkedList {

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

    public static void reverse(){
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }
    public static void display(){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println();

}

    public static void main(String[] args){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        head = n1;

        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        System.out.println("Before Reverse:");
        display();

        reverse();

        System.out.println("After Reverse:");
        display();
    }

}

