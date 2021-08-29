package TimeAndSpace;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={9,5,3,11,4,0,14,54};
        int d[]=mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(d));
    }

    private static int[] mergesort(int[] arr, int low, int high) {

        if(low==high)
        {
            int basearray[]= new int[1];
            basearray[0]=arr[low];
            return basearray;
        }

        int mid= low+(high-low)/2;
        int arr1[] =mergesort(arr,low,mid);
        int arr2[]= mergesort(arr,mid+1,high);

        int res[]= mergeTwoSortedArrays(arr1,arr2);
        return res;

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


