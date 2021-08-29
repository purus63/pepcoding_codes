package Recusion.array;

import java.util.Scanner;


public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++)
        {arr[i]=sc.nextInt();}
        int x =sc.nextInt();
        System.out.println(firstIndex(arr,0,x));
    }

    private static int firstIndex(int[] arr, int i, int x) {

        int idx=-1;
        if(i==arr.length)
            return -1;
        if(arr[i]==x)
            return i;
        return Math.max(idx,firstIndex(arr,i+1,x));
    }
}
