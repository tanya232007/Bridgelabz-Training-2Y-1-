package Recursion;

public class PrintNumbers {
        public static void print(int n) {
            if (n == -10) {
                System.out.println(n + " ");
                return;
            }
            print(n - 1);
            System.out.println(n + " ");
        }

        public static void main(String[] args) {
            print(10);
        }
    }

