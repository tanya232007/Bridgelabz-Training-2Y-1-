package Stacks.StackAssignment;

import java.util.Stack;

public class MinValue {
    public static void main(String[] args) {
        Stack<Integer> minst=new Stack<>();

        int[] arr={2,5,7,9,7};
        for(int i=0; i<arr.length; i++){
            minst.push(arr[i]);

            if(minst.isEmpty() || arr[i] <= minst.peek()){
                minst.push(arr[i]);
            }
        }
        System.out.println("Minimum value: " +minst.peek());

    }
}
