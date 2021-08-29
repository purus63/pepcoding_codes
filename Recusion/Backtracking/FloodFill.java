package Recusion.Backtracking;

import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }





    public static int[] rdir = {-1, 0, 1, 0};
    public static int[] cdir = {0, -1, 0, 1};
    public static char[] chArr = {'t', 'l', 'd', 'r'};

    public static void floodfill(int[][] board, int sr, int sc, String asf) {
        if(sr == board.length - 1 && sc == board[0].length - 1) {
            System.out.println(asf);
            return;
        }

        // mark
        board[sr][sc] = 1;

        for(int d = 0; d < rdir.length; d++) {
            int rr = sr + rdir[d];
            int cc = sc + cdir[d];
            char dir = chArr[d];

            if(rr >= 0 && rr < board.length && cc >= 0 && cc < board[0].length && board[rr][cc] != 1) {
                floodfill(board, rr, cc, asf + dir);
            }
        }

        // unmarking
        board[sr][sc] = 0;
    }
}
