package LEVEL1.A__REVISION.Recursion.Introduction.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        ArrayList<String> res= getMazePaths(0,0,n,m);
        System.out.println(res);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc)   {

        if(sr==dr || sc==dc)
        {
            return new ArrayList<>();
        }
        if(sr==dr-1 && sc==dc-1)
        {
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;

        }
        ArrayList<String> res= new ArrayList<>();


        ArrayList<String> r1=  getMazePaths(sr,sc+1,dr,dc);
        for(String s:r1)
        {
            res.add("h"+s);
        }

        ArrayList<String> r2=  getMazePaths(sr+1,sc,dr,dc);
        for(String s:r2)
        {
            res.add("v"+s);
        }

        return res;

    }
}
