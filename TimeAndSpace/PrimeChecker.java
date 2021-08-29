package TimeAndSpace;

public class PrimeChecker {
    public static void main(String[] args) {
        int arr[]={2,4,5,33,40,12,13,24,29,32,36,7,17};
        PrintPrime(arr);
    }
    public static void PrintPrime(int [] arr)
    {
        boolean isPrime[]=new boolean [41];
        for(int i=0;i<41;i++)
        {
            isPrime[i]=true;
        }
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2;i*i<=40;i++)
        {
            for(int j=i*i;j<=40;j+=i)
            {
                if(isPrime[j]==true)
                {
                    isPrime[j]=false;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(isPrime[arr[i]])
                System.out.println(arr[i]);
        }
    }
}
