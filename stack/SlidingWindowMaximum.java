package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowMaximum {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        slidingwindow(a,k);

    }

    public static int[] solve(int[] arr){

        Stack<Integer> st =new Stack<>();
        int ans[] =new int[arr.length];

        st.push(0);
        for(int i=1;i<arr.length;i++)
        {
            while( st.size()>0 && arr[i]> arr[st.peek()])
            {
                ans[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0)
        {
            ans[st.peek()]=arr.length;
            st.pop();
        }
        return ans;
    }

    private static void slidingwindow(int[] a,int k) {

        int ngr[]= solve(a);
        int j=0;
        //int ans[]= new int[a.length];
        for(int i=0;i<=a.length-k;i++)
        {
            if(j<i)
            {
                j=i;
            }
            while(i+k>ngr[j])
            {
                j=ngr[j];
            }
            System.out.println(a[j]);
            //ans[i]=a[j];
        }
        //return ans;
    }
}
