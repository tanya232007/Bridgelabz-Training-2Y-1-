package Arrays.Leetcode;

public class RotateArrays {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
    }

    public static void main(String[] args) {
        RotateArrays obj = new RotateArrays();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        obj.rotate(nums, k);

        System.out.print("Rotated Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

