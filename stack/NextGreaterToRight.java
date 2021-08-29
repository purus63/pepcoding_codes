package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterToRight {
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

        int[] ngr = solve(a);
        display(ngr);
    }
    // 2 4 1 5 6
    // 4 5 5 6 -1
    //
    public static int[] solve(int[] arr){

        Stack<Integer>st =new Stack<>();
        int ans[] =new int[arr.length];

        st.push(0);
        for(int i=1;i<arr.length;i++)
        {
            while( st.size()>0 && arr[i]> arr[st.peek()])
            {
                ans[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0)
        {
            ans[st.peek()]=-1;
            st.pop();
        }
        return ans;
    }
}
