package LEVEL1.A__REVISION.Recursion.Introduction;

import java.util.Scanner;

public class PrintIncreasingDecreasing {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        pdi(n);
    }

    public static void pdi(int n){
        if(n==0)
            return;
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);

    }
}
