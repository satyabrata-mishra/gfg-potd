package cp;
import java.util.*;
public class Total_Decoding_Messages 
{
	static int mod = 1000000007;
	public static int helper(String str,int n,int dp[])
	{
		if(n<=0)
			return 1;
		if(dp[n]!=-1)
			return dp[n];
		int ways=0;
		if(str.charAt(n)>='1')
			ways+=helper(str,n-1,dp);
		if((str.charAt(n-1)=='1' && str.charAt(n)<='9') || (str.charAt(n-1)=='2' && str.charAt(n)<='6'))
			ways+=helper(str,n-2,dp);
		return dp[n]=ways%mod;
	}
	public static int CountWays(String str)
    {
        int n = str.length();
        int dp[]=new int[n];
        Arrays.fill(dp, -1);
        return helper(str,n-1,dp)%mod;
    }
	public static void main(String[] args) 
	{
		System.out.println(CountWays("90"));
	}

}
