package Easy;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int arr[][]=new int [n+1][2*n];

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<2*n;j++)
            {
                if(i>=j)
                    System.out.print(Math.min(i,j)+"\t");
                else if(i+j==2*n)
                {
                    arr[i][j]=Math.min(i,j);
                    System.out.print(arr[i][j]+"\t");
                }
                else if(i+j>2*n)
                {
                    arr[i][j]=arr[i-1][j];
                    System.out.print(arr[i][j]+"\t");
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

}
