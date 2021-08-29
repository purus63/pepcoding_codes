package Recusion.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPath {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> al=getStairPaths(n);
        System.out.println(al);
    }

    public static ArrayList<String> getStairPaths(int n) {

            if(n==0)
            {
                ArrayList<String>alist =new ArrayList<>();
                alist.add("");
                return alist;
            }
            else if(n<0)
                return new ArrayList<String>();

            ArrayList<String> al1 =getStairPaths(n-1);
            ArrayList<String> al2 =getStairPaths(n-2);
            ArrayList<String> al3 =getStairPaths(n-3);

            ArrayList<String> res= new ArrayList<>();
            for(String s:al1)
            {res.add("1"+s);}

            for(String s:al2)
            {res.add("2"+s);}

            for(String s:al3)
            {res.add("3"+s);}
            return  res;
    }
}
