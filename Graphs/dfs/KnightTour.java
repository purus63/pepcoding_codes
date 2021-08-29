package Graphs.dfs;

import java.util.Scanner;

public class KnightTour {

    public static void main(String[] args) throws Exception {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int j=sc.nextInt();


        int chess[][] =new int[n][n];

        printKnightsTour(chess,i,j,1);

    }
    //static int[] x={-2,-2,-1,1,2,2,1,-1};
    //static int[] y={1,-1,-2,-2,-1,1,2,2};
    static int x[]={1,2,2,1,-1,-2,-2,-1};
    static int y[]={-2,-1,1,2,2,1,-1,-2};

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        chess[r][c]=upcomingMove;
        if(upcomingMove==chess.length* chess.length)
        {
            displayBoard(chess);
        }

        for(int idx=0;idx<8;idx++)
        {
            int i=r+y[idx];
            int j=c+x[idx];
            if(i>=0 && i<chess.length && j>=0 && j<chess.length && chess[i][j]==0) {
                printKnightsTour(chess, i, j, upcomingMove + 1);
            }
        }
        chess[r][c]=0;
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
