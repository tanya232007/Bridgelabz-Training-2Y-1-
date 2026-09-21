package StringsAssignment.Level2;

import java.util.Scanner;

public class StringLengthDemo {
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        int manualLen = getLength(str);
        int builtInLen = str.length();

        System.out.println("Manual length: " + manualLen);
        System.out.println("Built-in length: " + builtInLen);
        System.out.println("Results same? " + (manualLen == builtInLen));
    }
}

