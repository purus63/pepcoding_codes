package Easy;

import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
       // int m1=sc.nextInt();

        int mat1[][]= new int[n1][n1];
        for(int i=0;i<n1;i++)
            for(int j=0;j<n1;j++)
                mat1[i][j]=sc.nextInt();

        for(int k=1;k<=n1;k++)
        {
            for(int i=0;i<n1-k+1;i++) {
                int j = i + k - 1;
                if(j>=i)
                    System.out.println(mat1[i][j]);
            }
        }

    }
}
