package Recusion.Backtracking;

import java.util.Scanner;

public class KnightTours {
    static int yaxis[]={-2,-1,1,2,2,1,-1,-2};
    static int xaxis[]={1,2,2,1,-1,-2,-2,-1};
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int c=sc.nextInt();

        int chess[][]= new int[n][n];
        printKnightsTour(chess,r,c,1);
    }


    public static void printKnightsTour(int[][] chess, int row, int col, int upcomingMove) {

        if(upcomingMove== chess.length*chess.length)
        {
            chess[row][col]=upcomingMove;
            displayBoard(chess);
            chess[row][col]=0;
            return;
        }

        int r=row;
        int c=col;
        chess[r][c]=upcomingMove;
        for(int i=0;i<8;i++)
        {
            r=row+yaxis[i];
            c=col+xaxis[i];
            if(r>=0 && r<chess.length && c>=0 && c<chess.length && chess[r][c]==0)
            {
                printKnightsTour(chess,r,c,upcomingMove+1);
            }
        }
        chess[row][col]=0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}

