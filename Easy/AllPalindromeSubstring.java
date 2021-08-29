package Easy;

import java.util.Scanner;


public class AllPalindromeSubstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }

    private static void solution(String str) {

        int n=str.length();
        for(int i=0;i<n;i++) {
            for (int j = i + 1; j <= n; j++) {
                String s=str.substring(i,j);
                if(ispalindrome(s))
                    System.out.println(s);
            }
        }

    }

    private static boolean ispalindrome(String substring) {
        int n=substring.length()-1;
        int i=0;
        while(i<n)
        {
            if(substring.charAt(i)!=substring.charAt(n))
            {return false;}
            i++;
            n--;
        }
        return true;
    }
}
