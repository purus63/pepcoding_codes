package LEVEL1.A__REVISION.TimeAndSpace;

import java.util.Scanner;

public class RadixSort {

    public static void radixSort(int[] arr) {
        // write code here
        int max=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>max)
                max=i;
        }

        for(int exp=1;exp<=max;exp*=10)
        {
            countSort(arr,exp);
        }
    }

    public static void countSort(int[] arr, int exp) {
        // write code here
        int ans[]=new int[arr.length];
        int fmap[]= new int[10];
        for(int i=0;i<arr.length;i++)
        {
            fmap[(arr[i]/exp)%10]++;
        }

        for(int i=1;i<fmap.length;i++)
        {
            fmap[i]+=fmap[i-1];
        }

        for(int i=arr.length-1;i>=0;i--)
        {
             int pos=fmap[(arr[i]/exp)%10]-1;
             ans[pos]=arr[i];
             fmap[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=ans[i];
        }

        System.out.print("After sorting on " + exp + " place -> ");
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
    }
}
