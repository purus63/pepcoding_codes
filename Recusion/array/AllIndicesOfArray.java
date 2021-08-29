package Recusion.array;

import java.util.Scanner;

public class AllIndicesOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++)
        {arr[i]=sc.nextInt();}
        int x =sc.nextInt();
        int A[] = AllIndices(arr,x,0,0);
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
    }
    private static int[] AllIndices(int[] arr, int x, int i,int so_far) {

        if(i==arr.length)
        {
            return new int[so_far];
        }
        if(arr[i]==x)
            so_far++;
        int A[]= AllIndices(arr,x,i+1,so_far);
        if(arr[i]==x)
        {A[--so_far]=i;}
        return A;
    }
}
