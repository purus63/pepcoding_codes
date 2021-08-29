package Recusion.Backtracking;

import java.util.Scanner;

public class NQueen {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[][]= new int [n][n];

        printNQueens(arr,0,"",0,0);

    }
        static int xaxis[]={-1,-1,-1,0,1,1,1,0};
        static int yaxis[]={1,0,-1,-1,-1,0,1,1};
    public static void printNQueens(int[][] chess, int qcnt,String qsf, int row,int col) {

        if(row== chess.length) {
            if (qcnt == chess.length) {
                System.out.println(qsf+".");
            }
            return;
        }
    int r=row;
    int c=col;

    if(c+1<chess.length)
    {
        if(isValid(chess,r,c))
        {
            chess[r][c]=1;
            printNQueens(chess,qcnt+1,qsf+r+"-"+c+", ",r+1,0);
            chess[r][c]=0;
        }
        printNQueens(chess,qcnt,qsf,r,c+1);

    }
    else
    {
        if(isValid(chess,r,c))
        {
            chess[r][c]=1;
            printNQueens(chess,qcnt+1,qsf+r+"-"+c+", ",r+1,0);
            chess[r][c]=0;

        }
        printNQueens(chess,qcnt,qsf,r+1,0 );

    }

    }

    private static boolean isValid(int[][] chess, int row, int col) {

        int r,c;
        int rad=chess.length;

        for(int i=0;i<8;i++)
        {
            for(int j=1;j<rad;j++)
            {
                r=row+j*(yaxis[i]);
                c=col+j*(xaxis[i]);
                if(r>=0 && r<rad && c>=0 && c<rad)
                {
                    if(chess[r][c]==1)
                        return false;
                }
            }
        }
        return true;
    }



}
