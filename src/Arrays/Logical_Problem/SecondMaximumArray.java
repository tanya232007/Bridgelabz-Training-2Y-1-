package Arrays.Logical_Problem;

import java.util.Scanner;

public class SecondMaximumArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }


        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum element found!");
        } else {
            System.out.println("Second maximum element = " + secondMax);
        }
    }
}

