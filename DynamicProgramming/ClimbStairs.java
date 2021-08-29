package DynamicProgramming;

import java.util.Scanner;

public class ClimbStairs {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();


        int arr[]=new int[n+1];

        arr[0]=1;
        arr[1]=1;
        arr[2]=2;

        for(int i=3;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
        }

        System.out.println(arr[n]);
    }

}