package TimeAndSpace;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for(int i = 0 ; i < m; i++){
            b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a,b);
        print(mergedArray);
    }
    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    private static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int len1=arr1.length;
        int len2=arr2.length;
        int res[]=new int[len1+len2];

        int i=0,temp;
        int idx1=0,idx2=0;
        while(idx1<len1 && idx2<len2)
        {
            if(arr1[idx1]<arr2[idx2])
            {
                temp=arr1[idx1];
                idx1++;
            }
            else
            {
                temp=arr2[idx2];
                idx2++;
            }
            res[i++]=temp;
        }
        while(idx1<len1)
        {
            res[i++]=arr1[idx1];
            idx1++;
        }
        while(idx2<len2)
        {
            res[i++]=arr2[idx2];
            idx2++;
        }
        return res;
    }
}





