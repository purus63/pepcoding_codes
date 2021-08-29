package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SmallestNumberFollowingPattern {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<Integer> st =new Stack<>();
        int count=1;
        for(int i=0;i<str.length();i++)
        {
            st.push(count);
            count++;

            if(str.charAt(i)=='i')
            {
                while(st.size()>0)
                {
                    System.out.print(st.pop());
                }
            }
        }
        st.push(count);
        while (st.size()>0)
        {
            System.out.print(st.pop());
        }
    }
}
