package LEVEL1.A__REVISION.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class XBalancedBracket {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st= new Stack<>();

        int n=str.length();
        for(int i=n-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            if(ch==')' || ch=='}' || ch==']')
            {
                st.push(ch);
            }
            else if(ch=='(')
            {
                if(st.size()==0 || st.peek()!=')')
                {
                    System.out.println(false);return;
                }
                st.pop();
            }
            else if(ch=='{')
            {

                if(st.size()==0 || st.peek()!='}')
                {
                    System.out.println(false);return;
                }
                st.pop();
            }
            else if(ch=='[')
            {

                if(st.size()==0 || st.peek()!=']')
                {
                    System.out.println(false);return;
                }
                st.pop();
            }
            else
                continue;
        }
        if(st.size()>0)
        {
            System.out.println(false);return;
        }
        System.out.println(true);
    }
}
