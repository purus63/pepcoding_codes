package Medium;

import java.util.Scanner;

 class ExitPoint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int [n][m];

        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int i=0,j=0,count=0;

        while(true){
            if(arr[i][j]==1)
            {count++;}
            if(count%4==0)
            {
                j++;
                if(j>=m)
                { j--;break;}
            }
            else if(count%4==1)
            {
                i++;
                if(i>=n)
                { i--;break;}
            }
            else if(count%4==2)
            {
                j--;
                if(j<0)
                { j++;break;}
            }
            else if(count%4==3)
            {
                i--;
                if(i<0)
                {i++;break;}
            }

        }
        System.out.println(i +" "+ j);
    }

}


