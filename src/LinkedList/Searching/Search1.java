package LinkedList.Searching;
import static LinkedList.Searching.LinkList2.head;

public class
Search1 {

    public static int search(int key) {
        LinkList2.Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(search(30));
        System.out.println(search(40));
    }
}
