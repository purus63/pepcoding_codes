package Recusion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class SodukuSolver {
    public static void main(String[] args) {
        char board[][]= {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solveSudoku(board);
    }

    private static void solveSudoku(char[][] board) {

        solve(board,0,0);
    }

    private static void solve(char[][] board, int i, int j) {

        int ni,nj;
        if(i==9)
        {
            return;
        }
        if(j<8)
        {
            ni=i;
            nj=j+1;
        }
        else{
            ni=i+1;
            nj=0;
        }

        if(board[i][j]=='.')
        {
            for(int val=1;val<=9;val++)
            {
                char c= (char)(val+'0');
                if(isvalid(board,i,j,val))
                {
                    board[i][j]=c ;
                    solve(board,ni,nj);
                    board[i][j]='.';
                }
            }
        }else
            solve(board,ni,nj);


    }

    private static boolean isvalid(char[][] board, int x, int y,int val) {

        char ch= (char)(val+'0');
        //row chk
        for(int i=0;i<9;i++)
        {
            if(board[i][y]==ch)
                return false;
        }
        //col chk
        for(int i=0;i<9;i++)
        {
            if(board[x][i]==ch)
                return false;
        }
        //box chk
        int b_i=(x/3)*3;
        int b_j=(y/3)*3;

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[b_i+i][b_j+j]==ch)
                    return false;
            }
        }

        return true;
    }
}
