package LEVEL1.A__REVISION.Recursion.Introduction.array;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        System.out.println(firstIndex(arr,0,a));
    }

    public static int firstIndex(int[] arr, int idx, int x){

        if(arr[idx]==x)
            return idx;
        if(idx==arr.length)
            return -1;
        return firstIndex(arr,idx+1,x);
    }
}
