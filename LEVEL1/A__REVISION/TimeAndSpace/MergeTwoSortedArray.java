package LEVEL1.A__REVISION.TimeAndSpace;

import java.util.Scanner;

public class MergeTwoSortedArray {
    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        //write your code here
        int len1=a.length;
        int len2=b.length;
        int arr[] =new int[len1+len2];
        int idx=0,i=0,j=0;
        while(i<len1 && j<len2)
        {
            if(a[i]<b[j])
            {
                arr[idx++]=a[i];
                i++;
            }
            else{
                arr[idx++]=b[j];
                j++;
            }
        }
        while(i<len1)
        {
            arr[idx++]=a[i];i++;
        }
        while(j<len2)
        {
            arr[idx++]=b[j];j++;
        }
        return arr;
    }

    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
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
}
