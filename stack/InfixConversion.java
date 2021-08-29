package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixConversion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        infixtopostfix(exp);
       infixtoprefix(exp);
    }

    private static void infixtoprefix(String str) {
        Stack<Character> op = new Stack<>();
        Stack<String> valst = new Stack<>();
        String prefix="";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch ==' ')
                continue;
            else if(ch >='a' && ch<= 'z')
                valst.push(String.valueOf(ch));
            else if(ch == '(')
                op.push(ch);
            else if(ch ==')')
            {
                while(op.peek() != '(')
                {
                    String val2=valst.pop();
                    String val1=valst.pop();
                    char opera =op.pop();
                    prefix=opera+val1+val2;
                    valst.push(prefix);
                }
                op.pop();
            }
            else
            {
                while(op.size()>0 && op.peek()!='(' && priority(ch)<=priority(op.peek()))
                {
                    String val2=valst.pop();
                    String val1=valst.pop();
                    char opera =op.pop();
                    prefix=opera+val1+val2;
                    valst.push(prefix);
                }
                op.push(ch);
            }

        }
        while(op.size()>0)
        {
            String val2=valst.pop();
            String val1=valst.pop();
            char opera =op.pop();
            prefix=opera+val1+val2;
            valst.push(prefix);
        }
        System.out.println(valst.pop());
    }

    private static int priority(char peek) {
        if(peek =='/' || peek =='*')
            return 2;
        else if(peek =='+' || peek =='-')
            return 1;
        else
            return 0;
    }

    private static void infixtopostfix(String str) {
        Stack<Character> op = new Stack<>();
        Stack<String> valst = new Stack<>();
        String prefix="";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch ==' ')
                continue;
            else if(ch >='a' && ch<= 'z')
                valst.push(String.valueOf(ch));
            else if(ch == '(')
                op.push(ch);
            else if(ch ==')')
            {
                while(op.peek() != '(')
                {
                    String val2=valst.pop();
                    String val1=valst.pop();
                    char opera =op.pop();
                    prefix=val1+val2+opera;
                    valst.push(prefix);
                }
                op.pop();
            }
            else
            {
                while(op.size()>0 && op.peek()!='(' && priority(ch)<=priority(op.peek()))
                {
                    String val2=valst.pop();
                    String val1=valst.pop();
                    char opera =op.pop();
                    prefix=val1+val2+opera;
                    valst.push(prefix);
                }
                op.push(ch);
            }

        }
        while(op.size()>0)
        {
            String val2=valst.pop();
            String val1=valst.pop();
            char opera =op.pop();
            prefix=val1+val2+opera;
            valst.push(prefix);
        }
        System.out.println(valst.pop());
    }
}
