//  24 Feb 2022
package cp;

public class Return_Two_Prime_Number
{
	public static boolean isPrime(int n)
    {
        boolean b=true;
        for(int i=2;i<n;i++)
            if(n%i==0)
            {
            	b=false;
                return false;
            }
        return b;
    }
	public static void main(String[] args) 
	{
		int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        int N=74;
        for (int i=2;i<=N-2;i++)
            for(int j=2;j<=N-2;j++)
                if ((i+j==N) && isPrime(i) && isPrime(j) && (i<a || j<b))
                {
                	a=Math.min(i,j);
                    b=Math.max(i,j);
                }
        System.out.println(a+" "+b);
	}

}
