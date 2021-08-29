package LEVEL1.A__REVISION.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) throws Exception {

        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();

        Stack<Character> st =new Stack<>();

        int n=str.length();
        for(int i=n-1;i>=0;i--)
        {
            if( str.charAt(i)=='(' && st.size()>0 && st.peek()==')')
            {
                System.out.println(true);
                return;
            }
            else if(str.charAt(i)=='('){
                while(st.size()>0 && st.peek()!=')')
                {
                    st.pop();
                }
                st.pop();
            }
            else
                st.push(str.charAt(i));

        }

        System.out.println(false);
    }
}
