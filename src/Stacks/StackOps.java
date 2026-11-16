package Stacks;

public class StackOps {
    int[] arr=new int[5];
    int top=0;


    public void push(int data){
        arr[top]=data;

        top++;
    }
    public void display(){
        for(int n:arr){
            System.out.println(n+" ");
        }
    }

    static void main(String[] args) {
        StackOps st=new StackOps();
        st.push(10);
        st.push(20);
        st.display();
    }
}
