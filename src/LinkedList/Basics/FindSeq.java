package LinkedList.Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class FindSeq {
        public static ArrayList<String> subsequence(String s) {
            ArrayList<String> ans = new ArrayList<>();

            if (s.length() == 0) {
                ans.add("");
                return ans;
            }

            ArrayList<String> smallAns = subsequence(s.substring(1));

            for (String str : smallAns) {
                ans.add(s.charAt(0) + str);
            }

            for (String str : smallAns) {
                ans.add(str);
            }

            return ans;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String s = sc.nextLine();

            ArrayList<String> result = subsequence(s);

            System.out.println(result);
            System.out.println("Total subsequences: " + result.size());
        }

    }

