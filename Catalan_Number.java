//N = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …
package cp;
public class Catalan_Number 
{
	public static int findCatalan(int n) 
    {
		int mod=1000000007;
        long dp[]=new long[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                dp[i]=(dp[i]+(dp[j]*dp[i-j-1]))%mod;
            }
        }
        return (int)dp[n];
    }
	public static void main(String[] args) 
	{
//		System.out.println(findCatalan(4));
		System.out.println(findCatalan(200));
	}
}