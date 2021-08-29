package LEVEL1.A__REVISION.TimeAndSpace;

import java.util.Scanner;

public class PivotInSortedAndRotatedArray {

    public static int findPivot(int[] arr) {
        // write your code here
        return binarysearch(arr,0,arr.length-1);

    }

    private static int binarysearch(int[] arr, int i, int j) {

        if(i==j)
            return arr[i];

        int mid=i+(j-i)/2;

        if(arr[mid]<arr[j])
        {
            return binarysearch(arr,i,mid);
        }
        else
        {
            return binarysearch(arr,mid+1,j);
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int pivot = findPivot(arr);
        System.out.println(pivot);
    }

}
