package Recursion.StringProblem_Recursion;

import java.util.Scanner;

public class RemoveCharacter {
    public static String remove(String str, int index, char target) {

            if (index == str.length()) {
                return "";
            }

            String small = remove(str, index + 1, target);

            char ch = str.charAt(index);

            if (ch == target) {
                return small;
            }

            return ch + small;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();
            char target = sc.next().charAt(0);

            System.out.println(remove(str, 0, target));
        }
    }

