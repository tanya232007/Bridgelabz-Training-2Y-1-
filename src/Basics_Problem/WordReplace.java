package Basics_Problem;

import java.util.*;

public class WordReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldword = sc.nextLine();
        String newword = sc.nextLine();
        String result = sentence.replace(oldword, newword);
        System.out.println(result);

    }
}

