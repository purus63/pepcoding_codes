package Medium;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int m1=sc.nextInt();

        int mat1[][]= new int[n1][m1];
        for(int i=0;i<n1;i++)
            for(int j=0;j<m1;j++)
                mat1[i][j]=sc.nextInt();

            int i=0,j=0,a=0,b=0;
            while(a<n1 && b<m1){
                for(i=a;i<n1;i++){
                    System.out.println(mat1[i][b]);
                    }
                    b++;
                for(j=b;j<m1;j++){
                    System.out.println(mat1[n1-1][j]);
                }
                n1--;
                if(b<m1){
                for(i=n1-1;i>=a;i--) {
                    System.out.println(mat1[i][m1-1]);
                }
                m1--;}
                if(a<n1){
                for(j=m1-1;j>=b;j--) {
                    System.out.println(mat1[a][j]);
                }
                    a++;}
            }
    }
}
