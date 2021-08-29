package LEVEL1.A__REVISION.Recursion.Introduction.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPath {
    public static void main(String[] args) throws Exception {
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();

            ArrayList<String> al=getStairPaths(n);
          System.out.println(al);
    }

    public static ArrayList<String> getStairPaths(int n) {

        if(n==0)
        {
            ArrayList<String> b= new ArrayList<>();
            b.add("");
            return b;
        }
        ArrayList<String> res= new ArrayList<>();

        for(int i=1;i<=Math.min(3,n);i++)
        {
            ArrayList<String> l1 =getStairPaths(n-i);
            for(String s:l1)
            {
                res.add(i+s);
            }
        }
        return res;
    }
}
