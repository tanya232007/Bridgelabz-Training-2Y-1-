package LinkedList.Searching;


public class LinkList2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node head;
    static Node tail;

  public static void insertstart(int val){

        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }

    }
    public static void insertend(int val){

        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            tail = temp;
        }

    }
    public static Node mid(){
      Node slow=head;
      Node fast=head;
      while( fast != null && fast.next != null ){
          slow=slow.next;
          fast=fast.next.next;
      }
      return slow;
    }



    public static void display (LinkList2.Node head){
            while (head != null) {
                System.out.print(head.data + " -> ");
                head = head.next;
            }

        }
        public static void main (String[]args){
            insertstart(20);
            insertstart(30);
            insertstart(40);
            insertstart(50);

            display(head);
        }
    }






