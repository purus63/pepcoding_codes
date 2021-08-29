package LEVEL1.A__REVISION.StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SmallestNumberFollowingPattern {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // code
        Stack<Integer> st= new Stack<>();
        int idx=1;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='d' || ch=='i') {
                st.push(idx++);
            }
            while(st.size()>0 && ch=='i')
            {
                System.out.print(st.pop());
            }
        }
        st.push(idx);
        while(st.size()>0)
        {
            System.out.print(st.pop());
        }
    }
}
