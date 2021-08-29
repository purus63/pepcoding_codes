package LEVEL1.A__REVISION.Recursion.Introduction.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class XGetMazePathWithJumps {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        ArrayList<String> res = getMazePaths(0,0,n,m);
        System.out.println(res);
    }


    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

    return null;

    }
}
