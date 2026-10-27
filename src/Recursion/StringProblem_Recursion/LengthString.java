package Recursion.StringProblem_Recursion;

import java.util.Scanner;

public class LengthString {

    public static int findLength(String str,int index){
        if(index==str.length()){
            return 0;
        }
        return 1+findLength(str,index+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(findLength(str,0));
    }
}
