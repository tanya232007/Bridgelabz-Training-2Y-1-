package Recursion;

public class SearchIndex {
    public static int search(int arr[],int index,int target){
        if(index==arr.length-1){
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return search(arr, index + 1, target);

    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 99, 45};
        int target = 99;

        int result = search(arr, 0, target);
        System.out.println("Index of " + target + " = " + result);

    }
}
