package Time_Complexity;

import java.util.Scanner;

public class NaturalNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n * (n + 1) / 2);
    }
}
