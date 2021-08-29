package LEVEL1.A__REVISION.Recursion.Introduction.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKpc {
    static String[] keypad = {"","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(getKPC(str));
    }

    public static ArrayList<String> getKPC(String str) {

        if(str.length()==0)
        {
            ArrayList<String> b=new ArrayList<>();
            b.add("");
            return b;
        }

        ArrayList<String> res= new ArrayList<>();
        int n= str.charAt(0)-'0';
        String s=keypad[n];
        ArrayList<String> r1=getKPC(str.substring(1));
        for(int i=0;i<s.length();i++)
        {
            for(String ss:r1)
                res.add(s.charAt(i)+ss);
        }
        return res;
    }
}
