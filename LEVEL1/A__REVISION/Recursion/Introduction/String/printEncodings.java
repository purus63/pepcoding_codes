package LEVEL1.A__REVISION.Recursion.Introduction.String;

import java.util.Scanner;

public class printEncodings {

    static char[] ch= {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();

        printEncodings(str,"");
    }

    public static void printEncodings(String str,String psf) {

        if(str.length()==0)
        {
            System.out.println(psf);
            return;
        }

        int x=str.charAt(0)-'0';
        if(x>0)
            printEncodings(str.substring(1),psf+ch[x]);

        if(str.length()>1)
        {   int y=str.charAt(1)-'0';
            int num= x*10+y;
            if(num>9 && num <27)
            printEncodings(str.substring(2),psf+ch[num]);
        }

    }
}
