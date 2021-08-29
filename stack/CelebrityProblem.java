package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    private static void findCelebrity(int[][] arr) {
        Stack<Integer> st =new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            st.push(i);
        }

        int x,y;
        while(st.size()>1)
        {
            x=st.pop();
            y=st.pop();

            if(arr[x][y]==1)
            {st.push(y);}
            else
            {st.push(x);}
        }
        int flag=0;
        for(int i=st.peek(),j=0;j<arr.length;j++)
        {
            if(arr[i][j]==0 || i==j)
            {continue;}
            else{flag=1;break;}
        }
        for(int i=st.peek(),j=0;j<arr.length;j++)
        {
            if(arr[j][i]==1 || i==j)
            {continue;}
            else{flag=1;break;}
        }
        if(flag==0)
        {
            System.out.println(st.pop());
        }
        else
        {
            System.out.println("none");
        }

    }

    /*          BRUTE FORCE
    public static void findCelebrity(int[][] arr) {
        int arr1[]= new int[arr.length];
        int arr2[] =new int [arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr1[i]+=arr[i][j];
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr2[i]+=arr[j][i];
            }
        }
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr1[i]==0 && arr2[i]>=arr.length-1)
            {System.out.println(i);flag=1;}
        }
        if(flag==0)
        {
            System.out.println("none");
        }
    }

     */
}
