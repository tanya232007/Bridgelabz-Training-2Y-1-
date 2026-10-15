package Arrays.Leetcode;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int maxLength=0;
        for(int r=0 ; r<s.length(); r++)
        {
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(left));
                left++;

            }
            set.add(s.charAt(r));
            maxLength=Math.max(maxLength,r-left+1);
        }
        System.out.println(maxLength);

    }
}
