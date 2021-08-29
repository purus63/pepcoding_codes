package Recusion.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathWithJumps {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(getMazePathWithJumps(0,0,n-1,m-1));
    }

    private static ArrayList<String> getMazePathWithJumps(int sr, int sc, int dr, int dc) {

        if(sr== dr && sc ==dc)
        {
            ArrayList<String> a= new ArrayList<>();
            a.add("");
            return a;
        }

        ArrayList<String> res =new ArrayList<>();
        for(int jump=1;jump+sc<=dc;jump++)
        {
            ArrayList<String> alh= getMazePathWithJumps(sr,sc+jump,dr,dc);
            for(String s:alh)
            {res.add("h"+jump+s);}
        }
        for(int jump=1;jump+sr<=dr;jump++)
        {
            ArrayList<String> alv = getMazePathWithJumps(sr+jump,sc,dr,dc);
            for(String s:alv)
            {res.add("v"+jump+s);}
        }
        for(int jump=1;jump+sc<=dc && jump+sr<=dr;jump++)
        {
            ArrayList<String> alv = getMazePathWithJumps(sr+jump,sc+jump,dr,dc);
            for(String s:alv)
            {res.add("d"+jump+s);}
        }

        return res;

    }
}
