package Recursion.StringProblem_Recursion;

import java.util.Scanner;

public class RemoveDuplicate {
    public static String removeDuplicate(String str,int index,String ans){
        if(index==str.length()){
            return ans;
        }
        char ch=str.charAt(index);
        if(ans.indexOf(ch)==-1){
            ans=ans+ch;
        }
        return removeDuplicate(str,index+1,ans);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(removeDuplicate(str,0,""));

    }
}
