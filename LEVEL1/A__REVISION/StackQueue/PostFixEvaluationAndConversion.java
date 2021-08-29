package LEVEL1.A__REVISION.StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostFixEvaluationAndConversion {
    public static void postfixeval(String str){

        Stack<Integer> st= new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>47 && ch<58)
            {
                st.push(ch-'0');
            }
            else if(ch<48 || ch>57)
            {
                int val2=st.pop();
                int val1=st.pop();
                int ans=0;
                if(ch=='+'){ ans= val1+val2;}
                else if(ch=='-'){ ans= val1-val2;}
                else if(ch=='*'){ ans= val1*val2;}
                else if(ch=='/'){ ans= val1/val2;}
                st.push(ans);
            }

        }
        System.out.println(st.pop());
    }


    public static void posttoinfix(String str){

        Stack<String> st= new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>47 && ch<58)
            {
                st.push(ch+"");
            }
            else if(ch<48 || ch>57)
            {
                String val2=st.pop();
                String val1=st.pop();
                String ans="("+ val1+ch+val2+")";
                st.push(ans);
            }

        }
        System.out.println(st.pop());
    }


    public static void posttoprefix(String str){

        Stack<String> st= new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>47 && ch<58)
            {
                st.push(ch+"");
            }
            else if(ch<48 || ch>57)
            {
                String val2=st.pop();
                String val1=st.pop();
                String ans= ch+val1+val2;
                st.push(ans);
            }

        }
        System.out.println(st.pop());
    }




    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // code
        postfixeval(str);
        posttoinfix(str);
        posttoprefix(str);
    }
}
