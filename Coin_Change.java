package cp;
public class Coin_Change 
{
	public long count(int coins[], int N, int sum) 
    {
		 long[] dp = new long[sum + 1];
		 dp[0] = 1;
		 for(int i = 0; i < coins.length; ++i)
		 {
			 if(coins[i] > sum) 
				 continue;
			 for(int j = coins[i]; j <= sum; ++j)
				 if(dp[j - coins[i]] > 0) 
					 dp[j] += dp[j -coins[i]];
		 }        
		 return dp[sum];
    }
	public static void main(String[] args) 
	{
		 int sum = 4;
		 int coins[] = {1,2,3};
		 Coin_Change c = new Coin_Change();
		 System.out.println(c.count(coins, coins.length, sum));
	}
}