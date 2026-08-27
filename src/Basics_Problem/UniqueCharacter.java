package Basics_Problem;
import java.util.*;

public class UniqueCharacter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int f[] = new int[256];
        for(int i=0; i<str.length(); i++)
        {
            f[str.charAt(i)]++;
        }
        for(int i=0; i<str.length(); i++)
        {
            if(f[str.charAt(i)] == 1)
            {
                System.out.println(str.charAt(i));
                return;
            }
        }
        System.out.println("No unique Character");


    }
}
