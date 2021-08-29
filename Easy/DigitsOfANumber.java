package Easy;

import java.util.Scanner;
import java.util.Stack;

public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();

        int x;

        while(n>0)
        {
            x=n%10;
            stack.push(x);
            n/=10;
        }
        while(!stack.empty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
