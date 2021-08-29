package TimeAndSpace;

import java.util.Scanner;

public class PivotInARotatedArray {

    public static int findPivot(int[] arr) {
        int low =0;
        int high=arr.length-1;
        int res=pivotinSortedarray(arr,low,high);
        return res;
    }

    private static int pivotinSortedarray(int[] arr, int low, int high) {

        int mid=low+(high-low)/2;

        if(arr[mid]>arr[high])
        {
            return pivotinSortedarray(arr,mid+1,high);
        }
        else if(arr[mid]<arr[high])
        {
            return pivotinSortedarray(arr,low,mid);
        }
        else{
            return arr[mid];
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
