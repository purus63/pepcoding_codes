package Recusion.Backtracking;

public class DemoTraversal {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n=sc.nextInt();
        queen();
        knight();
    }

    private static void knight() {
        int sr=3,sc=3;
        int xaxis[]={-2,-2,-1,1,2,2,1,-1};
        int yaxis[]={1,-1,-2,-2,-1,1,2,2};

        System.out.println("\n\n"+"KNIGHT"+"\n\n");

        for(int i=0;i<8;i++)
        {
            int dr=sr+xaxis[i];
            int dc=sc+yaxis[i];

            if(dr>=0 && dr<8 && dc>=0 && dc<8)
            {
                System.out.println("dr --> "+dr+"  dc --> "+dc);
            }

        }

    }

    private static void queen() {
        int sr=0,sc=0;
        int radius=8;

        int xaxis[]={-1,-1,0,1,1,1,0,-1};
        int yaxis[]={0,-1,-1,-1,0,1,1,1};

        System.out.println("\n\n"+"QUEEN"+"\n\n");

        for(int rad=1;rad<radius;rad++)
        {
            for(int i=0;i<xaxis.length;i++)
            {
                int dr=sr+(rad*xaxis[i]);
                int dc=sc+(rad*yaxis[i]);

                if(dr>=0 && dr<radius && dc>=0 && dc<radius)
                {
                    System.out.println("dr --> "+dr+"  dc --> "+dc);
                }

            }
        }

    }
}
