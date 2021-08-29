package Recusion.Backtracking;

public class PrintWays2D {
    public static void main(String[] args) {
        int n=4,m=4,r=0,c=0,bsf=0;
        String asf="";
        printway2d(n,m,r,c,bsf,asf);
    }

    private static void printway2d(int n, int m, int r, int c, int bsf, String asf) {
        if(r==n)
        {
            if(bsf==4)
                System.out.println(asf);
            return;
        }

        if(c+1<m)
        {
            printway2d(n,m,r+1,0,bsf+1,asf+"("+r+"-"+c+"), ");
            printway2d(n,m,r,c+1,bsf,asf);
        }
        else
        {
            printway2d(n,m,r+1,0,bsf+1,asf+"("+r+"-"+c+") '");
            printway2d(n,m,r+1,0,bsf,asf);
        }
    }


}
