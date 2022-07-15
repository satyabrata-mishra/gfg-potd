package cp;
import java.util.*;
public class Min_Coins
{
	public static int MinCoin(int[] nums, int amount)
    {
        // Code here
		int dp[] = new int[amount+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
	    dp[0] = 0;
	    for(int amt=0; amt<=amount; amt++)
	       {
	          int min = Integer.MAX_VALUE;
	          for(int coin : nums)
	              if(coin <= amt)
	            	  min = Math.min(min, dp[amt-coin]);
	          if(min != Integer.MAX_VALUE)
	        	  dp[amt] = 1 + min;
	       }
	    return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
	public static void main(String[] args)
	{
		int nums[]= {11, 6, 13, 10};
		int amount = 30;
		System.out.println(MinCoin(nums,amount));
	}

}
