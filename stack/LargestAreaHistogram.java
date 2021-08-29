package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class LargestAreaHistogram {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int rsi[] = RSI(a);
        int lsi[] = LSI(a);
         int maxi =Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int temp = (rsi[i]-lsi[i]-1)*a[i];
            if(maxi<temp)
                maxi=temp;
        }
        System.out.println(maxi);
    }

    private static int[] LSI(int[] arr) {
        Stack<Integer> st =new Stack<>();

        int ans[]= new int[arr.length];
        st.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--)
        {
            while(st.size()>0 && arr[st.peek()]>arr[i])
            {
                ans[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0)
        {
            ans[st.peek()]=-1;st.pop();
        }
        return ans;
    }

    private static int[] RSI(int[] arr) {
        Stack<Integer> st =new Stack<>();

        int ans[]= new int[arr.length];
        st.push(0);
        for(int i=1;i<arr.length;i++)
        {
            while(st.size()>0 && arr[st.peek()]>arr[i])
            {
                ans[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0)
        {
            ans[st.peek()]=arr.length;st.pop();
        }
        return  ans;
    }

}
