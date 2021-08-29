package Easy;

import java.util.Scanner;

public class TheStateOfWakanda1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int m1=sc.nextInt();

        int mat1[][]= new int[n1][m1];
        for(int i=0;i<n1;i++)
            for(int j=0;j<m1;j++)
                mat1[i][j]=sc.nextInt();

        for(int i=0;i<m1;i++)
        {
            if(i%2==0)
            for(int j=0;j<n1;j++)
            {
                { System.out.println(mat1[j][i]);}
            }
            if(i%2==1)
            for(int j=n1-1;j>=0;j--)
            {
                { System.out.println(mat1[j][i]);}
            }
        }
    }
}
