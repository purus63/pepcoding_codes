package Medium;

import java.util.Scanner;

public class SearchInASorted2DArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int mat[][]= new int [n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }

        int x=sc.nextInt();

        int lt=0,rt=n-1;
        int idx_i=-1,idx_j=-1;
        while (true)
        {
            if(mat[lt][rt]==x)
            {idx_i=lt;idx_j=rt;break;}
            else if(mat[lt][rt]<x)
            {
                lt++;
                if(lt==n)
                    break;
            }
            else
            {
                rt--;
                if(rt==-1)
                    break;
            }
        }
        if(idx_i!=-1)
        {System.out.println(idx_i);
         System.out.println(idx_j);
        }
        else
            System.out.println("Not Found");
    }
}
