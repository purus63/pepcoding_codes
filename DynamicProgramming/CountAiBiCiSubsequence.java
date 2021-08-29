package DynamicProgramming;

import java.util.Scanner;

public class CountAiBiCiSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();

        int acnt=0;
        int bcnt=0;
        int ccnt=0;


        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a')
            {
                acnt=2*acnt+1;
            }
            else if(str.charAt(i)=='b')
            {
                bcnt=2*bcnt+acnt;
            }
            else if(str.charAt(i)=='c')
            {
                ccnt=2*ccnt+bcnt;
            }

        }

        System.out.println(ccnt);

    }

}
