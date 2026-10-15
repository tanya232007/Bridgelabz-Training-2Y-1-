package Arrays.Leetcode;

import java.util.*;

public class SearchInsertionPosition35 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int left=0;
        int right=0;
        int i=-n-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println(left);
    }
}


