package Recursion;
public class GCD {
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        int x = 12, y = 16;
        System.out.println("GCD of " + x + " and " + y + " = " + gcd(x, y));
    }
}


