package Recusion.Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NqueenLeetcode {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();

        List<List<String>> ans=solveNQueens(n);
        System.out.println(ans);
    }

    static List<List<String>> res= new ArrayList<>();
    public static List<List<String>> solveNQueens(int n) {

        int arr[][] = new int[n][n];
        helper(arr,0,new ArrayList<>());
        return res;

    }

    static void helper(int arr[][] ,int r,ArrayList<String> al)
    {

        if(r==arr.length)
        {
            res.add(new ArrayList<>(al));
            return;
        }

        for(int col=0;col<arr.length;col++)
        {
            String str="";
            if(isSafe(arr,r,col))
            {
                for(int i=0;i<arr.length;i++)
                {
                    if(i==col)
                        str+='Q';
                    else
                        str+='.';
                }
                al.add(str);
                arr[r][col]=1;
                helper(arr,r+1,al);
                al.remove(al.size()-1);
                arr[r][col]=0;
            }

        }

    }

    static int x[]={-1,0,1};
    static int y[]={-1,-1,-1};
    public static boolean isSafe(int arr[][],int row,int col)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                int r=row+y[j]*i;
                int c=col+x[j]*i;
                if(r>=0 && r<n && c>=0 && c<n && arr[r][c]==1)
                {
                    return false;
                }
            }

        }
        return true;

    }
}
