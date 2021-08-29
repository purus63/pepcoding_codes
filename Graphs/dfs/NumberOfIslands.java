package Graphs.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public enum NumberOfIslands {
    ;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            String parts = br.readLine();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
            }
        }

        // write your code here

        int count=0;
        int [][] visited=new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==0 && visited[i][j]==0)
                {
                    dfs(i,j,arr,visited);
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    private static void dfs(int i, int j, int[][] arr, int[][] visited) {

        visited[i][j]=1;

        int x[]={-1,0,1,0};
        int y[]={0,-1,0,1};

        for(int a=0;a<4;a++)
        {
            if(isSafe(i+y[a],j+x[a],arr,visited))
            {
                dfs(i+y[a],j+x[a],arr,visited);
            }
        }

    }

    private static boolean isSafe(int i, int j, int[][] arr, int[][] visited) {
            if(i>=0 && i<arr.length &&  j>=0 && j<arr[0].length && visited[i][j]==0 && arr[i][j]==0)
                return true;
            else
                return false;
    }
}
