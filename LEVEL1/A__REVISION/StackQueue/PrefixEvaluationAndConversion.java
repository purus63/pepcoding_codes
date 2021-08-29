package LEVEL1.A__REVISION.StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PrefixEvaluationAndConversion {

    public static void prefix_to_infix(String str)
    {
        Stack<String> val_infix= new Stack<>();
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch= str.charAt(i);


            if(ch<48 || ch>57)
            {
                if(val_infix.size()>=2)
                {
                    String a= val_infix.pop();
                    String b= val_infix.pop();
                    String pre_val= "("+a+ch+b+")";

                    val_infix.push(pre_val);
                }
            }
            else if(ch>47 && ch<58)
            {
                val_infix.push(ch+"");
            }
        }
        System.out.println(val_infix.pop());
    }

    public static void prefix_to_postfix(String str)
    {
        Stack<String> val_postfix= new Stack<>();
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch= str.charAt(i);

            if(ch<48 || ch>57)
            {
                if(val_postfix.size()>=2)
                {
                    String a= val_postfix.pop();
                    String b= val_postfix.pop();
                    String post_val= a+b+ch;
                    val_postfix.push(post_val);
                }
            }
            else if(ch>47 && ch<58)
            {
                val_postfix.push(ch+"");
            }
        }
        System.out.println(val_postfix.pop());
    }

    public static void eval(String s)
    {
        Stack<Integer> st= new Stack<>();
        int ans=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch= s.charAt(i);

            if(ch<48 || ch>57)
            {
                if(st.size()>=2)
                {
                    if(ch=='+'){ans=st.pop()+st.pop();}
                    else if(ch=='-'){ans=st.pop()-st.pop();}
                    else if(ch=='*'){ans=st.pop()*st.pop();}
                    else if(ch=='/'){ans=st.pop()/st.pop();}
                    st.push(ans);
                }
            }
            else if(ch>47 && ch<58)
            {
                st.push(ch-'0');
            }
        }
        System.out.println(st.pop());
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        eval(str);


        prefix_to_infix(str);
        prefix_to_postfix(str);
    }
}
