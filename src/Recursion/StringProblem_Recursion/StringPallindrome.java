package Recursion.StringProblem_Recursion;

public class StringPallindrome {
    public static boolean pallindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return pallindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str="tanya";
        System.out.println(pallindrome(str,0,str.length()-1));

    }
}
