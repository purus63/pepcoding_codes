package LEVEL1.A__REVISION.StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class XLargestAreaHistogram {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nse_r=new int[n];
        int[] nse_l=new int[n];

        Stack<Integer> st= new Stack<>();

        for(int i=0;i<n;i++)
        {
                while(st.size()>0 && a[i]<a[st.peek()])
                {
                    nse_r[st.pop()]=i;
                }
                st.push(i);
        }
        while(st.size()>0)
        {
            nse_r[st.pop()]=n;
        }

        for(int i=n-1;i>=0;i--)
        {
            while(st.size()>0 && a[i]<a[st.peek()])
            {
                nse_l[st.pop()]=i;
            }
            st.push(i);
        }
        while(st.size()>0)
        {
            nse_l[st.pop()]=-1;
        }

        int maxarea=0;

        for(int i=0;i<n;i++)
        {
            maxarea=Math.max(maxarea,a[i]*(nse_r[i]-nse_l[i]-1));
        }
        System.out.println(maxarea);
    }
}
