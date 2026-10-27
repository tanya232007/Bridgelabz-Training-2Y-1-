package Recursion.AdvanceRecursion;

public class TowerOfHanoi {

    public static void TowerOfHanoi(int n, char source, char helper, char destination){
        if(n==1){
            System.out.println("Move Disk" +n+ " from " +source+" to " +destination);
            return;
        }
        TowerOfHanoi(n-1,source,destination,helper);
        System.out.println("Move Disk " + n +" from " +source+ " to " +destination);
        TowerOfHanoi(n-1,helper,source,destination);
    }

    public static void main(String[] args) {
        int n=3;
        TowerOfHanoi(n,'A','B','C');
    }
}

