package stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(validparenthesis(str));
    }

    private static boolean validparenthesis(String str) {
        Stack<Character> st= new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            char ch =str.charAt(i);
            if(ch == '(' || ch=='{' || ch=='[')
            {
                st.push(ch);
            }
            else if(ch == ')')
            {
                if(st.size()==0 || st.peek()!='(')
                {return false;}
                st.pop();
            }
            else if(ch == '}')
            {
                if(st.size()==0 || st.peek()!='{')
                { return false;}
                st.pop();
            }
            else if(ch == ']')
            {
                if(st.size()==0 || st.peek()!='[')
                { return false;}
                st.pop();
            }
            else {continue;}
        }
        return st.size()==0;

    }
}
