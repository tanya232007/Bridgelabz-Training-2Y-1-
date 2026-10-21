package Recursion;

import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class FindMax_Element {
    public static void print(String name, int index) {
        if (index == name.length()) {
            return;
        }
        System.out.println(name.charAt(index));
        print(name, index + 1);
    }

    public static void reverse(String name, int index) {
        if (index == name.length()) {
            return;
        }
        print(name, index + 1);
        System.out.println(name.charAt(index));

    }

    public static boolean pallindrome(String name, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (name.charAt(start) != name.charAt(end)) {
            return false;
        }
        return pallindrome(name, start + 1, end - 1);

    }

    public static int BinearySearch(int arr[], int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, start, mid - 1, target);
        }

        return binarySearch(arr, mid + 1, end, target);
    }

    public static String remove(String nums, int index) {
        if (index == nums.length()) {
            return " ";
        }
        String small = remove(nums, index + 1);
        char ch = nums.charAt(index);
        if (ch != 'a') {
            return ch + small;
        }
        return small;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Print:");
        print(str, 0);
        System.out.println("Reverse:");
        reverse(str, 0);

        System.out.println("Pallindrome:");
        System.out.println(FindMax_Element.pallindrome(str, 0, str.length() - 1));

        System.out.println("Remove a:");
        System.out.println(remove(str, 0));

        int arr[] = {1, 3, 5, 7, 9};

        System.out.println("Binary Search:");
        System.out.println(FindMax_Element.BinearySearch(arr, 0, arr.length - 1, 7));

    }
}






