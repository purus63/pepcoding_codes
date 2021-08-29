package Recusion.array;

import java.util.Scanner;

public class MaximumOfAnArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int arr[]= new int[n];

        for(int i=0;i<n;i++)
        {arr[i]=sc.nextInt();}
        System.out.println(MaximumofAnArray(arr,0));
    }

    private static int MaximumofAnArray(int[] arr, int i) {
        if(i==arr.length)
            return Integer.MIN_VALUE;
        int maxi=MaximumofAnArray(arr,i+1);
        if(arr[i]>maxi)
            return arr[i];
        else
            return  maxi;
    }
}
