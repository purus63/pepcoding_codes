package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int arr[][] =new int [n][n];
        for(int a[]: arr)
        { Arrays.fill(a,1);}

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || j==0)
                    System.out.print(arr[i][j]+"\t");
                else if(j<i)
                {
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                    System.out.print(arr[i][j]+"\t");
                }
            }
            System.out.println();
        }

    }
}
