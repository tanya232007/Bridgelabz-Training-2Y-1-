package Basics_Problem;

import java.util.*;

public class DiscreteNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();

        int[] arr1 = new int[26];
        for(char ch : p.toCharArray()) arr1[ch-'a']++;

        int[] arr2 = new int[26];
        boolean found = false;

        for(int i=0; i<s.length(); i++) {
            arr2[s.charAt(i)-'a']++;
            if(i >= p.length()) arr2[s.charAt(i-p.length())-'a']--;

            boolean b = true;
            for(int j=0; j<26; j++) {
                if(arr1[j] != arr2[j]) {
                    b = false;
                    break;
                }
            }

            if(b) {
                System.out.println((i-p.length()+1) + " ");
                found = true;
            }
        }
        if(!found) System.out.println(-1);
    }
}
