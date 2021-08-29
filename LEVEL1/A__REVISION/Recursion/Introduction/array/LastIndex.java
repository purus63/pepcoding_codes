package LEVEL1.A__REVISION.Recursion.Introduction.array;

import java.util.Scanner;

public class LastIndex {
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

        System.out.println(lastIndex(arr,0,a,-1));

    }

    public static int lastIndex(int[] arr, int idx, int x,int ans){

        if(idx==arr.length)
        {
            return ans;
        }
        if(arr[idx]==x)
            ans=idx;
        return lastIndex(arr,idx+1,x,ans);


    }

}
