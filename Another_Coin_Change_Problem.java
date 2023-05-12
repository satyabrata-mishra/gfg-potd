package cp;
public class Another_Coin_Change_Problem 
{
	public static boolean makeChanges(int N, int K, int target, int[] coins) 
    {
		boolean [][]dp = new boolean[K+1][target+1];
        dp[0][0]=true;
        for(int i=0;i<N;i++)
            for(int j=1;j<=K;j++)
                for(int k=1;k<=target;k++)
                    if(coins[i]<=k && dp[j][k]==false)
                    	dp[j][k] = dp[j-1][k-coins[i]];
        return dp[K][target];
    }
	public static void main(String[] args) 
	{
		int coins[] = {1, 10, 5, 8, 6};
		int k = 3, target = 11;
		System.out.println(makeChanges(coins.length,k,target,coins)?1:0);
	}
}