package Recursion.StringProblem_Recursion;

import java.util.Scanner;

public class VowelsCount {
    public static int countVowels(String str,int index){
        if(index==str.length()){
            return 0;
        }
        char ch = Character.toLowerCase(str.charAt(index));

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return 1 + countVowels(str, index + 1);
    }
        return countVowels(str, index + 1);
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(countVowels(str, 0));
    }
}
