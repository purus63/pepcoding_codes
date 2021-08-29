package Easy;

import java.util.Scanner;

public class StringWithDiffernceinConsecutiveChar {
    public static String solution(String str){
        String res="";
        int n=str.length();
        int i;
        for(i=1;i<n;i++)
        {
                res+=Character.toString(str.charAt(i-1))+(str.charAt(i)-str.charAt(i-1));
        }
        res+=Character.toString(str.charAt(i-1));
        return res;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }
}
