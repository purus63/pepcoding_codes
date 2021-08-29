package Recusion.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKpc {
    public static String arr[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) throws Exception {

        Scanner sc =new Scanner(System.in);
        String str= sc.nextLine();
        ArrayList<String> al=getKPC(str);
        System.out.println(al);
    }

    public static ArrayList<String> getKPC(String str) {

        if(str.length()==0)
        {
            ArrayList<String> alist=new ArrayList<>();
            alist.add("");
            return alist;
        }

        int idx= str.charAt(0)-'0';
        String code=arr[idx];
        //System.out.println(code);
        String s= str.substring(1);

        ArrayList<String> al= getKPC(s);
        ArrayList<String> res=new ArrayList<>();
        for(int i=0;i<code.length();i++){
            char ch=code.charAt(i);
            for(String s1:al)
            {
                res.add(ch+s1);
            }
        }
        return res;
    }

}
