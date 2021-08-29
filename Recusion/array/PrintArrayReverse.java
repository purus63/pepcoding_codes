package Recusion.array;

import java.util.Scanner;

public class PrintArrayReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++)
        {arr[i]=sc.nextInt();}
        printarrayreverse(arr,0);
    }

    private static void printarrayreverse(int[] arr, int i) {
        if(i==arr.length)
            return;
        printarrayreverse(arr,i+1);
        System.out.println(arr[i]);
    }
}
