package Arrays.Leetcode;

import java.util.Scanner;
import java.util.Arrays;

public class LongestSubString3 {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();

       int[] lastIndex = new int[256];
       Arrays.fill(lastIndex, -1);

       int maxLen = 0;
       int start = 0;

       for (int end = 0; end < s.length(); end++)
       {
           char c = s.charAt(end);
           if (lastIndex[c] >= start)
           {
               start = lastIndex[c] + 1;
           }

           lastIndex[c] = end;
           maxLen = Math.max(maxLen, end - start + 1);
       }
       System.out.println(maxLen);
   }
}

