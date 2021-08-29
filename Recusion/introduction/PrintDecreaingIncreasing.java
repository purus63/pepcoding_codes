package Recusion.introduction;

import java.util.Scanner;

public class PrintDecreaingIncreasing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        printDecreasingIncreasing(n);
        //printDecreasingIncreasing2(n);
    }

    private static void printDecreasingIncreasing(int n) {
        if(n==0)
            return;
        System.out.println(n);
        printDecreasingIncreasing(n-1);
        System.out.println(n);
    }

  /*   private static void printDecreasingIncreasing2(int n) {
        printDecreasing(n);
        printIncreasing(n);

    }

   private static void printDecreasing(int n) {
        if(n==0)
            return;
        System.out.println(n);
        printDecreasing(n-1);
    }

    private static void printIncreasing(int n) {

        if(n==0)
            return;
        printIncreasing(n-1);
        System.out.println(n);
    }
*/

}
