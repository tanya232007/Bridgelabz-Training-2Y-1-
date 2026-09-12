package SlidingWindow;

public class Question1 {

    public static void main(String[] args) {
        int num[] ={2, 3, 4, 5, 6};
        int size = 3;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += num[i];
        }
        System.out.println("First window sum: " + sum);
        for (int i = size; i < num.length; i++) {
            sum += num[i] - num[i - size];
            System.out.println("Next window sum: " + sum);

        }
    }
}
