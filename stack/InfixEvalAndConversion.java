package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixEvalAndConversion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        prefixeval(exp);
        prefixtoinfix(exp);
        prefixtopostfix(exp);
        // code
    }

    private static void prefixtoinfix(String exp) {
        Stack<String> valst = new Stack<>();

        for(int i=exp.length()-1;i>=0;i--)
        {
            char ch = exp.charAt(i);
            if(ch >= '0' && ch <='9' ){valst.push(""+ch);}
            else
            {
                String val1=valst.pop();
                String val2=valst.pop();
                String val = '('+val1+ch+val2+')';
                valst.push(val);
            }
        }
        System.out.println(valst.pop());
    }

    private static void prefixtopostfix(String exp) {
        Stack<String> valst = new Stack<>();

        for(int i=exp.length()-1;i>=0;i--)
        {
            char ch = exp.charAt(i);
            if(ch >= '0' && ch <='9' ){valst.push(""+ch);}
            else
            {
                String val1=valst.pop();
                String val2=valst.pop();
                String val = val1+val2+ch;
                valst.push(val);
            }
        }
        System.out.println(valst.pop());
    }

    private static void prefixeval(String exp) {
        Stack<Integer> valst = new Stack<>();

        for(int i=exp.length()-1;i>=0;i--)
        {
            char ch = exp.charAt(i);
            if(ch >= '0' && ch <='9' ){valst.push(ch-'0');}
            else
            {
                int val1=valst.pop();
                int val2=valst.pop();
                int val = eval(val1,val2,ch);
                valst.push(val);
            }
        }
        System.out.println(valst.pop());
    }

    private static int eval(int val1, int val2, char ch) {
        if(ch=='+'){return val1+val2;}
        else if(ch=='-'){ return val1-val2;}
        else if(ch=='*'){ return val1*val2;}
        else if(ch=='/'){ return val1/val2;}
        else return -1;
    }
}
