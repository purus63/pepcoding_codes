package Easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RotateaNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rot=sc.nextInt();

        String str= Integer.toString(n);
        int len=str.length();
        rot=rot%len;

        if(rot<0)
            rot= len-Math.abs(rot);

            for (int i = len - rot; i < len; i++) {
                System.out.print(str.charAt(i));
            }
            for (int i = 0; i < len - rot; i++) {
                System.out.print(str.charAt(i));
            }
    }
}
