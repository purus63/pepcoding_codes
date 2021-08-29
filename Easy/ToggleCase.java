package Easy;

import java.util.Locale;
import java.util.Scanner;

public class ToggleCase {

    public static String toggleCase(String str){
        int len=str.length();
        StringBuilder sbr=new StringBuilder();
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)<=90)
                sbr.append(Character.toString(str.charAt(i)).toLowerCase());
            else
                sbr.append(Character.toString(str.charAt(i)).toUpperCase());
        }
        return sbr.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}
