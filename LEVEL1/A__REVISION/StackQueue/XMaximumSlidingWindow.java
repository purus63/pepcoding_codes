package LEVEL1.A__REVISION.StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class XMaximumSlidingWindow {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        int ans[]= new int[n];

        Stack<Integer> st= new Stack<>();
        HashMap<Integer,Integer>hmap = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            while(st.size()>0 && a[i]>a[st.peek()])
            {
                hmap.put(st.pop(),i);
            }
            st.push(i);
        }

        while(st.size()>0)
        {
            hmap.put(st.pop(),-1);
        }

        for(int i=0;i<=n-k;i++)
        {
            ans[i]=a[i];
            for(int j=0;j<k;j++)
            {
                if(hmap.get(i+j)>i+j+(k-1))
                {break;}
                else{
                    ans[i]=a[hmap.get(i+j)];
                }
            }

        }

    }
}
