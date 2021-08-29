package LEVEL1.A__REVISION.StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<Integer> i_st =new Stack<>();
        Stack<Character> c_st= new Stack<>();

          for(int i=0;i<str.length();i++)
          {
              char ch= str.charAt(i);
              if(ch==' ')
                  continue;
              if(ch<48 || ch>57)
              {
                  c_st.push(ch);
              }
              else if(ch>=48 && ch <=57)
              {

              }


          }

    }
}
