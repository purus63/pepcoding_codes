package TimeAndSpace;

import java.util.Scanner;

public class Sort012 {
    //DUTCH NATIONAL FLAG
    public static void sort012(int[] arr){

        int i=0;
        int j=0;
        int k=arr.length-1;
        while(i<=k)
        {
            if(arr[i]==0)
            {
                swap(arr,i,j);
                i++;
                j++;
            }
            else if(arr[i]==1)
            {
             i++;
            }
            else if(arr[i]==2)
            {
                swap(arr,i,k);
                k--;
            }

        }

    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i < n; i++){
            arr[i] = scn.nextInt();
        }
        sort012(arr);
        print(arr);
    }

}
/*
* int pivot=arr.length-1;
        int i_idx1=0;
        int i_idx2=0;
        int i=0;
        while(i<=pivot)
        {
            if(arr[i]==0)
            {
                i_idx1++;
                i_idx2++;
                i++;
            }
            if(arr[i]==1)
            {
                swap(arr,i,i_idx1);
                i_idx1++;
            }
            if(arr[i]==2)
            {
                swap(arr,i,i_idx2);
                i_idx2++;
            }


        }
*/