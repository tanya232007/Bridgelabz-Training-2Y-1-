package Arrays.Leetcode;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

      int[] numbers=new int[n];
      for(int i=0; i<n; i++)
      {
          numbers[i]=sc.nextInt();

      }
      int target=sc.nextInt();
      int[] result=twoSum(numbers,target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[]{-1, -1};
    }
}





