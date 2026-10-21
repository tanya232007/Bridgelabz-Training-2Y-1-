package Recursion.StringProblem_Recursion;

import java.util.Scanner;

public class EqualString {
    public static boolean equal(String s1,String s2,int index){
        if(s1.length() != s2.length()){
            return false;
        }
        if(index==s1.length()){
            return true;
        }
        if (s1.charAt(index) != s2.charAt(index)) {
            return false;
        }
        return equal(s1,s2,index+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(equal(s1,s2,0));
    }
}
