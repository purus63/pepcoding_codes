package LEVEL1.A__REVISION.StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class StockSpan {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] span = solve(a);
        display(span);
    }

    public static int[] solve(int[] arr){
        // solve
        Stack<Integer> st =new Stack<>();
        int ans[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--)
        {
            while(st.size()>0 && arr[i]>arr[st.peek()])
            {
                ans[st.pop()]=i;
            }
            st.push(i);
        }
        while(st.size()>0)
        {
            ans[st.pop()]=-1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(ans[i]!=-1)
            {
                ans[i]=i-ans[i];
            }
            else{
                ans[i]=i+1;
            }
        }
        return ans;
    }

}
