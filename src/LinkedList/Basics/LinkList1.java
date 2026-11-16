package LinkedList.Basics;

public class LinkList1 {
        public static class Node
        {
            int data;
            Node next;

            public Node(int data)
            {

                this.data=data;
            }
        }
        public static void display(Node head)
        {
            while (head!=null)
            {
                System.out.print(head.data+" -> ");
                head=head.next;
            }

        }

        public static void recursiveLinkedList(Node head){
            if(head==null){
                return;
            }
            System.out.print(head.data+" -> ");
            recursiveLinkedList(head.next);
        }
        public static void main(String[] args) {
            Node a=new Node(5);
            Node b=new Node(6);
            Node c=new Node(7);
            Node d=new Node(8);
            Node e=new Node(9);

            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;

            System.out.println("Trick 1 with the help of Sout");
            System.out.print(a.data+" -> ");
            System.out.print(a.next.data+" -> ");
            System.out.print(a.next.next.data+" -> ");
            System.out.print(a.next.next.next.data+" -> ");
            System.out.print(a.next.next.next.next.data+" -> ");
            System.out.print(a.next.next.next.next.next);

            System.out.println();
            System.out.println("Trick 2 with the help of for loop ");
            Node temp=a;
            for(int i=0;i<5;i++)
            {
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }

            System.out.println();
            System.out.println("Trick 3 with the help of while loop ");

            Node temp2=a;
            while (temp2!=null)
            {
                System.out.print(temp2.data+" -> ");
                temp2=temp2.next;
            }

            System.out.println();
            System.out.println("Trick 4");
            display(a);

            System.out.println();
            System.out.println("Trick 5 -- Using Recursive Call");
            recursiveLinkedList(a);
        }
}
