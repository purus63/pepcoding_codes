package Easy;

import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        StringBuilder sbr =new StringBuilder(sc.next());

        int i=sbr.length()-1;
        int n,res=0,j=0;
        while(sbr.length()>0)
        {
            //System.out.println(sbr);
            if(sbr.charAt(i)>=65)
                n=sbr.charAt(i)-55;
            else
                n=sbr.charAt(i)-48;
            sbr=sbr.deleteCharAt(i);
            res+=n*Math.pow(16,j);
            i--;j++;
        }
        System.out.println(res);

    }
}
