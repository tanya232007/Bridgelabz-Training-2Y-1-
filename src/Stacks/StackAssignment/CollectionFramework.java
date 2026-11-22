package Stacks.StackAssignment;

import java.util.Deque;
import java.util.LinkedList;

public class CollectionFramework {
        public static void main(String[] args) {

            Deque<Integer> stack = new LinkedList<>();

            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println("Stack: " + stack);
            System.out.println("Top: " + stack.peek());

            stack.pop();

            System.out.println("After Pop: " + stack);
        }
    }
