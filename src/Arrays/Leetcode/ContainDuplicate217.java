package Arrays.Leetcode;

import java.util.*;

public class ContainDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if (nums[i] == nums[i+1])
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i]=sc.nextInt();
        }
        ContainDuplicate217 obj = new ContainDuplicate217();
        boolean ans=obj.containsDuplicate(nums);
        System.out.println(ans ? "Yes, Duplicate Found" : "No, All Unique");

    }
}
