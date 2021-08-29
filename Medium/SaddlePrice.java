package Medium;

import java.util.Arrays;
import java.util.Scanner;

public class SaddlePrice {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int arr[][] = new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        boolean flag=true;
        int indx=0;

        for(int i=0;i<n;i++)
        {
            indx=0;flag=true;
            for(int j=0;j<n;j++)
            {
                if(arr[j][i]>arr[indx][i])
                {
                    indx=j;
                }
            }

            for(int j=0;j<n;j++)
            {
                if(arr[indx][i]>arr[indx][j])
                {
                    flag=false;
                    break;
                }
            }

            if(flag==true)
            {
                System.out.println(arr[indx][i]);
                return;
            }

        }

        System.out.println("Invalid input");

    }
}

