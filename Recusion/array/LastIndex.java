package Recusion.array;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++)
        {arr[i]=sc.nextInt();}
        int x =sc.nextInt();
        System.out.println(lastIndex(arr,0,x));
    }

    private static int lastIndex(int[] arr, int i, int x) {

        if(i==arr.length)
            return -1;
        int idx=lastIndex(arr,i+1,x);

        if(arr[i]== x)
            return Math.max(i,idx);
        return idx;

    }

}
