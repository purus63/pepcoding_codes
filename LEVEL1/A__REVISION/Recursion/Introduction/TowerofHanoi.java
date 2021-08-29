package LEVEL1.A__REVISION.Recursion.Introduction;

import java.util.Scanner;

public class TowerofHanoi {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        toh(n,a,b,c);

    }

    public static void toh(int n, int t1, int t2, int t3){
        if(n==0)
            return;
        toh(n-1,t1,t3,t2);
        System.out.println(n+"["+t1+" -> "+t2+"]");
        toh(n-1,t3,t2,t1);

    }
}
