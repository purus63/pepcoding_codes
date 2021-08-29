package Recusion.Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nqueenusingdfs {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();

        List<List<String>> ans=solveNQueens(n);
        System.out.println(ans);
    }


    static int[] xaxis={-1,-1,0,1,1,1,0,-1};
    static int[] yaxis={0,-1,-1,-1,0,1,1,1};
    static List<List<String>> res=new ArrayList<>();

    public static List<List<String>> solveNQueens(int n) {

        for(int j=0;j<n;j++)
        {
            int chess[][] = new int[n][n];
            ArrayList<String> al= new ArrayList<>();
            dfs(chess,0,j,al);
        }
        return res;

    }

    static void dfs(int chess[][],int x,int y,ArrayList<String> al)
    {
        int n=chess.length;

        int temp[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[i][j]=chess[i][j];
            }
        }

        chess[x][y]=1;

        String str="";
        for(int a=0;a<n;a++)
        {
            if(a==y)
                str+="Q";
            else
                str+=".";
        }
        al.add(str);

        for(int i=1;i<n;i++)
        {
            for(int j=0;j<8;j++)
            {
                int r=x+yaxis[j]*i;
                int c=y+xaxis[j]*i;
                if(r>=0 && r<n && c>=0 && c<n && chess[r][c]==0)
                {
                    chess[r][c]=1;
                }

            }
        }

        for(int l=0;l<n;l++)
        {
            if(x+1<n && chess[x+1][l]==0)
            {
                dfs(chess,x+1,l,al);
                chess=temp;
            }
        }
        if(al.size()==n)
        {
            res.add(new ArrayList(al));
            al.remove(al.size()-1);
            return;
        }
        else
        {
            al.remove(al.size()-1);
        }


    }

}