package LEVEL1.A__REVISION.TimeAndSpace;

import java.util.Scanner;

public class CountSort {
    public static void countSort(int[] arr, int min, int max) {
        //write your code here
        int A[] =new int[max-min+1];

        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            A[arr[i]-min]=1;
        }
        int idx=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==1)
            {
                arr[idx++]=i+min;
            }
        }

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr,min,max);
        print(arr);
    }

}
