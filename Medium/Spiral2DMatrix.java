package Medium;

import java.util.Scanner;

public class Spiral2DMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int m1=sc.nextInt();

        int mat1[][]= new int[n1][m1];
        for(int i=0;i<n1;i++)
            for(int j=0;j<m1;j++)
                mat1[i][j]=sc.nextInt();
        int total=n1*m1;
        int cnt=0;

        int mincol=0,minrow=0,maxcol=m1-1,maxrow=n1-1;
        while(cnt<total)
        {
            for(int i=minrow;i<=maxrow && cnt<total;i++)
            {
                System.out.println(mat1[i][mincol]);cnt++;
            }
            mincol++;
            for(int j=mincol;j<=maxcol && cnt<total;j++)
            {
                System.out.println(mat1[maxrow][j]);cnt++;
            }
            maxrow--;
            for(int i=maxrow;i>=minrow && cnt<total;i--)
            {
                System.out.println(mat1[i][maxcol]);cnt++;
            }
            maxcol--;
            for(int j=maxcol;j>=mincol && cnt<total;j--)
            {
                System.out.println(mat1[minrow][j]);cnt++;
            }
            minrow++;
        }
    }
}
