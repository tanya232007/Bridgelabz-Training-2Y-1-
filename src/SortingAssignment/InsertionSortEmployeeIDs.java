package SortingAssignment;

import java.util.Scanner;

public class InsertionSortEmployeeIDs {
        public static void insertionSort(int[] employeeIDs) {
            int n = employeeIDs.length;
            for (int i = 1; i < n; i++) {
                int key = employeeIDs[i];
                int j = i - 1;
                while (j >= 0 && employeeIDs[j] > key) {
                    employeeIDs[j + 1] = employeeIDs[j];
                    j = j - 1;
                }
                employeeIDs[j + 1] = key;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of employees: ");
            int n = sc.nextInt();

            int[] employeeIDs = new int[n];
            System.out.println("Enter " + n + " Employee IDs:");
            for (int i = 0; i < n; i++) {
                employeeIDs[i] = sc.nextInt();
            }
            insertionSort(employeeIDs);
            System.out.println("\nSorted Employee IDs (Ascending Order):");
            for (int id : employeeIDs) {
                System.out.print(id + " ");

        }
    }
}
