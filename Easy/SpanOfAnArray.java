package Easy;

import java.util.Scanner;

public class SpanOfAnArray {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {arr[i]=sc.nextInt();}

        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            mini=Math.min(mini,arr[i]);
            maxi=Math.max(maxi,arr[i]);
        }

        System.out.println(maxi-mini);
    }
}
