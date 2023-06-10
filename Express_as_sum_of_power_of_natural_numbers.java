package cp;
import java.util.*;
public class Express_as_sum_of_power_of_natural_numbers 
{
	static int solve(int n, int x, int curr, int[][] dp)
	{
        if(n == 0) 
        	return 1;
        if(n < 0 || Math.pow(curr, x) > n) 
        	return 0;
        if(dp[n][curr] != -1) 
        	return dp[n][curr];
        return dp[n][curr] = (solve(n-(int)Math.pow(curr, x), x, curr+1, dp) + solve(n, x, curr+1, dp)) % 1000000007;
    }
    static int numOfWays(int n, int x)
    {
        int dp[][]=new int[n+1][n+1];
        for(int i[]:dp)
        	Arrays.fill(i,-1);
        return solve(n, x, 1, dp);
    }
	public static void main(String[] args)
	{
		System.out.println(numOfWays(10,2));
	}
}