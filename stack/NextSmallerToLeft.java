package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextSmallerToLeft {
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

        int[] nsl = solve(a);
        display(nsl);
    }

    private static int[] solve(int[] a) {
        Stack<Integer> st =new Stack<>();
        int ans[]= new int[a.length];

        st.push(a.length-1);
        for(int i=a.length-2;i>=0;i--)
        {
            while(st.size()>0 && a[st.peek()]>a[i])
            {
                ans[st.peek()]=a[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0)
        {
            ans[st.peek()]=-1;
            st.pop();
        }
        return  ans;
    }

}
