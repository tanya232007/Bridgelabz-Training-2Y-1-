package Recursion.StringProblem_Recursion;

import java.util.Scanner;

public class CharacterCount {
    public static int CharacterCount(String str,int index,char target){
        if(index==str.length()){
            return 0;
        }
        if(str.charAt(index) == target) {
            return 1 + CharacterCount(str, index + 1, target);
        }

        return CharacterCount(str, index + 1, target);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char target=sc.next().charAt(0);
        System.out.println(CharacterCount(str,0,target));
    }
}
