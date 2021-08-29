package LEVEL1.A__REVISION.leetcode;

import java.util.HashSet;

public class IsValidSoduku {
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
        System.out.println(isValidSudoku(board));

    }
    static HashSet<String> hset = new HashSet<>();
    public static  boolean  isValidSudoku(char[][] board) {

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    String s1= "row"+i+"val"+board[i][j];
                    String s2= "col"+j+"val"+board[i][j];
                    String s3= "box"+((i/3)*3+(j/3))+"val"+board[i][j];

                    if(hset.contains(s1) || hset.contains(s2) || hset.contains(s3))
                        return false;
                    else
                    {hset.add(s1);hset.add(s2);hset.add(s3);}
                }
                else
                    continue;
            }
        }



        return true;
    }


}
