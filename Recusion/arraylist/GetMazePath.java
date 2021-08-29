package Recusion.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(getMazePaths(0,0,n-1,m-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        } else if (sr > dr || sc > dc)
        {return new ArrayList<>();}

       /* if (sr >= dr || sc >= dc) {
       //sr==dr && sc<dc && sc==dc && sr<dr
            ArrayList<String> a = new ArrayList<>();
            if(sr==dr && sc ==dc)
                {a.add("");}
            return a;
        }*/



        ArrayList<String> alh= getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> alv= getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String> res = new ArrayList<>();
        for(String s:alh)
        {
            res.add("h"+s);
        }
        for(String s:alv)
        {
            res.add("v"+s);
        }
        return res;
    }

}
