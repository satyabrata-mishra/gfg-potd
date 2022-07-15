package cp;
public class Number_Of_Ways 
{
	static long arrangeTiles(int N)
    {
		long dp[]=new long[N+1];
		for(int i=0;i<=N;i++)
			if(i==0 || i==1 || i==2 || i==3)
				dp[i]=1;
			else
				dp[i] = dp[i-1] + dp[i-4];
		return dp[N];
    }
	public static void main(String[] args) 
	{
		System.out.println(arrangeTiles(4));
	}

}
