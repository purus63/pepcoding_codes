package stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        System.out.println(duplicatebracket(str));
    }

    private static boolean duplicatebracket(String str) {

        Stack<Character> st =new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=')')
            {
                st.push(str.charAt(i));
            }
            else
            {
                if(st.peek()=='(')
                    return true;
                while(st.peek()!='(')
                {
                    st.pop();
                }
                st.pop();
            }
        }
        return false;

    }


}
