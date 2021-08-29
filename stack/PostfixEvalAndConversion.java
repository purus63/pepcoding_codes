package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixEvalAndConversion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        postfixeval(exp);
        postfixtoinfix(exp);
        postfixtoprefix(exp);
        // code
    }

    private static void postfixtoprefix(String exp) {
        Stack<String> valst = new Stack<>();

        for(int i=0;i<exp.length();i++) {
            char ch = exp.charAt(i);
            if(ch>='0' && ch <='9')
                valst.push(""+ch);
            else
            {
                String val1=valst.pop();
                String val2=valst.pop();
                String val= ch+val2+val1;
                valst.push(val);
            }
        }
        System.out.println(valst.pop());
    }

    private static void postfixtoinfix(String exp) {
        Stack<String> valst = new Stack<>();

        for(int i=0;i<exp.length();i++) {
            char ch = exp.charAt(i);
            if(ch>='0' && ch <='9')
                valst.push(""+ch);
            else
            {
                String val1=valst.pop();
                String val2=valst.pop();
                String val= '('+val2+ch+val1+')';
                valst.push(val);
            }
        }
        System.out.println(valst.pop());
    }

    private static void postfixeval(String exp) {
        Stack<Integer> valst = new Stack<>();

        for(int i=0;i<exp.length();i++)
        {
            char ch = exp.charAt(i);
            if(ch==' ')
                continue;
            else if((ch>='0' && ch <='9'))
                valst.push(ch-'0');
            else
            {
                int val1=valst.pop();
                int val2=valst.pop();
                int val=eval(val1,val2,ch);
                valst.push(val);
            }
        }
        System.out.println(valst.pop());
    }

    private static int eval(int num1, int num2, char opera) {

        if(opera== '+') {return (num1+num2);}
        else if(opera =='-'){return (num2-num1);}
        else if(opera =='*'){return (num2*num1);}
        else if(opera =='/'){return (num2/num1);}
        else return 0;
    }
}
