package Time_Complexity;

public class GCD {
        public static void main(String[] args) {
            int a = 54;
            int b = 24;

            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }

            System.out.println("GCD is: " + a);
        }

}
