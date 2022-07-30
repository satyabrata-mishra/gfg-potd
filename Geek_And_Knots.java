package cp;

public class Geek_And_Knots 
{
	public static int ncr(int n,int r)
	{
		int dp[][]=new int[n+1][r+1];
		for(int i=0;i<=n;i++)
			dp[i][0]=1;
		for(int i=1;i<=n;i++)
			for(int j=1;j<=r;j++)
				dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
		return dp[n][r];
	}
	 public static int knots(int m, int n, int k)
	 {
		 return ncr(n,k) * ncr(m,k);
	 }
	public static void main(String[] args) 
	{
		int m = 2, n = 2, k = 2;
		System.out.println(knots(m,n,k));
	}

}
