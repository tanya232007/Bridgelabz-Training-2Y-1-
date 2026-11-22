package Stacks;

public class StackOps2 {
    int[] arr = new int[5];
    int top = 0;


    public void push(int data) {
        if(top== arr.length){
            System.out.println("Stack is full");
            return;
        }
        arr[top]=data;
        top++;
    }
    public int pop() {
        if (top == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];

    }


    public void display() {
        for (int n : arr) {
            System.out.println(n + " ");
        }
    }

    public static void main(String[] args) {
        StackOps2 st=new StackOps2();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.display();
        System.out.println(st);

        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
    }
}

