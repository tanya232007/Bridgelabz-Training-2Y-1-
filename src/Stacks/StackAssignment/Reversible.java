package Stacks.StackAssignment;

import java.util.Stack;

public class Reversible {

    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        String s="{[()]}";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);

            if(ch == '{' || ch == '[' || ch == '('){
                st.push(ch);
            }
            else{
                st.pop();
            }

        }
        if(st.isEmpty()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
