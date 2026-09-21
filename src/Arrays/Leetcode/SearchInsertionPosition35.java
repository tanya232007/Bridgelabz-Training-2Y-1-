package Arrays.Leetcode;

import java.util.*;

public class SearchInsertionPosition35 {
    public static void main(String[] args)
    {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i = 0; i<n; i++)
    {
        nums[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    int start = 0;
    int end = nums.length - 1;
    while(start<=end)
    {
        int mid = (start + end) / 2;
        if (nums[mid] == target)
        {
            System.out.println(mid);
            return;
        }
        else if (nums[mid] < target)
        {
            start = mid + 1;
        }
        else
        {
            end = mid - 1;
        }
    }
    System.out.println(start);
}
}


