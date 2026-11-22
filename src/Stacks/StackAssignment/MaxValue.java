package Stacks.StackAssignment;

import java.util.Stack;

public class MaxValue {

    public static void main(String[] args) {
        Stack<Integer> maxst = new Stack<>();

        int[] arr = {2, 5, 7, 9, 7};
        for (int i = 0; i < arr.length; i++) {
            maxst.push(arr[i]);

            if (maxst.isEmpty() || arr[i] <= maxst.peek()) {
                maxst.push(arr[i]);
            }
        }
        System.out.println("Maximum value: " + maxst.peek());

    }
}

