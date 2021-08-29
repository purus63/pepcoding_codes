package Recusion.introduction;

import java.util.Scanner;

public class PrintZigZag {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();

        printzigzag(n);

    }

    private static void printzigzag(int n) {
        if (n==0)
            return;
        System.out.print(n+" ");
        printzigzag(n-1);
        System.out.print(n+" ");
        printzigzag(n-1);
        System.out.print(n+" ");
    }
}
