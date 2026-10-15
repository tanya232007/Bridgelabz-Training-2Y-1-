package Recursion;

public class MaxArray {
    public static int max(int arr[],int index){
     if(index==arr.length-1){
         return arr[index];
     }
        return Math.max(arr[index], max(arr, index + 1));
    }
//    int small=max(arr,index+1);
//     return Math.max(arr[index], max(arr, index + 1));

    public static void main(String[] args) {
     int[] arr={10,20,30,50,50};
     int result=max(arr,0);
        System.out.println("Maximum element in array = " + result);

    }
}


