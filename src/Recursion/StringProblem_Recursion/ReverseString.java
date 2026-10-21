package Recursion.StringProblem_Recursion;

public class ReverseString {
    public static void reverse(String str,int index){
        if(index==str.length()){
            return;
        }
        reverse(str,index+1);
        System.out.println(str.charAt(index));
    }

    public static void main(String[] args) {
        String str="Tanya";
        reverse(str,0);
    }
}
