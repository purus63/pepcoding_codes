package Recusion.array;

import java.util.Scanner;

public class PrintArrayUsingRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++)
        {arr[i]=sc.nextInt();}
        printarray(arr,0);
    }

    private static void printarray(int[] arr, int i) {

        if(i==arr.length)
            return;
        System.out.println(arr[i]);
        printarray(arr,i+1);


    }
}
