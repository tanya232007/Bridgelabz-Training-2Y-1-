package Arrays.Leetcode;

import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }

        int max = sum;
        for(int i=1; i<=n-k; i++){
            sum = sum - arr[i-1] + arr[i+k-1];
            max = Math.max(sum, max);
        }

        System.out.println(max);
    }
}
