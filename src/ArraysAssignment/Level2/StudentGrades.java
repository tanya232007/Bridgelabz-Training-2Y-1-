package ArraysAssignment.Level2;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[][] marks = new int[n][3];

        String[] names = {"Student1", "Student2", "Student3"};

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of " + names[i] + " (Physics, Chemistry, Maths):");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percent = total / 3.0;
            char grade;
            if (percent >= 80) grade = 'A';
            else if (percent >= 60) grade = 'B';
            else if (percent >= 40) grade = 'C';
            else grade = 'D';

            System.out.println(names[i] + " Percentage = " + percent + "% Grade = " + grade);
        }
    }
}

