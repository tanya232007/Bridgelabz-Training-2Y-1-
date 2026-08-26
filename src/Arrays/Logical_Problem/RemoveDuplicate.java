//package Arrays.Logical_Problem;

import java.util.Scanner;

public class RemoveDuplicate {

    public static void removeDuplicate(int arr[], int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");


            }
        }
    }
}


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    RemoveDuplicate.removeDuplicate(arr, n);

}

