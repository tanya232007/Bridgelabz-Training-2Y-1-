package StringsAssignment.Level2;

import java.util.Random;
import java.util.Scanner;

public class VotingCheck {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + rand.nextInt(90);
        }
        return ages;
    }
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) result[i][1] = "false (Invalid)";
            else if (ages[i] >= 18) result[i][1] = "true (Can Vote)";
            else result[i][1] = "false (Cannot Vote)";
        }
        return result;
    }
    public static void display(String[][] data) {
        System.out.println("Age\tEligibility");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] eligibility = checkEligibility(ages);

        display(eligibility);
    }

}
