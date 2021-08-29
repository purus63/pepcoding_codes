package stack;

import java.util.*;
public class InfixEvaluation {

        //helper
        public static int priority(char op){
            if(op=='/' || op=='*')
                return 2;
            else if(op =='+' || op =='-')
                return 1;
            else
                return 0;
        }

        public static int evaluate(int val1,int val2,char op)
        {
            if(op=='*') {return val1*val2;}
            else if(op=='/'){return val1/val2;}
            else if(op=='-'){return val1-val2;}
            else if(op=='+'){return val1+val2;}
            else {return 0;}
        }


        // infix
        public static int infixEvaluation(String str) {
            Stack<Character> optr= new Stack();
            Stack<Integer> valst = new Stack();
            //string contains spaces
            for(int i=0;i<str.length();i++)
            {
                char ch =str.charAt(i);
                if(ch==' ')
                    continue;
                else if(ch =='('){
                    optr.push('(');
                }
                else if(ch>='0' && ch<='9')
                {
                    valst.push(ch-'0');
                }
                else if(ch == ')'){
                    while(optr.peek()!='(')
                    {
                        int val2=valst.pop();
                        int val1=valst.pop();
                        char op= optr.pop();
                        int res= evaluate(val1,val2,op);
                        valst.push(res);
                    }
                    optr.pop();
                }
                else{
                    while(optr.size()>0 && optr.peek()!= '(' && priority(optr.peek())>=priority(ch))
                    {
                        int val2=valst.pop();
                        int val1=valst.pop();
                        char op= optr.pop();
                        int res= evaluate(val1,val2,op);
                        valst.push(res);
                    }
                    optr.push(ch);
                }
            }
            while(optr.size()>0)
            {
                int val2=valst.pop();
                int val1=valst.pop();
                char op= optr.pop();
                int res= evaluate(val1,val2,op);
                valst.push(res);
            }

            return valst.pop();
        }

        public static void infixToPrefix(String str) {

        }

        public static void infixToPostfix(String str) {

        }

        // prefix
        public static int prefixEvaluation(String str) {
    return 0;
        }

        public static void prefixToInfix(String str) {

        }

        public static void prefixToPostfix(String str) {

        }

        // postfix
        public static int postfixEvaluation(String str) {
    return 0;
        }

        public static void postfixToPrefix(String str) {

        }

        public static void postixToinfix(String str) {

        }

        public static void evaluation() {
            Scanner sc =new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(infixEvaluation(str));

        }

        public static void main(String[] args) {
            evaluation();
        }

}
