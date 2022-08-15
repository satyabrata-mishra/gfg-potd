package cp;
import java.util.*;
public class Pots_Of_Gold_Game 
{
	public static int helper(int A[],int start,int end,int dp[][])
	{
		if(start==end)
			return A[start];
		if(start+1==end)
			return dp[start][end]=Math.max(A[start],A[end]);
		if(dp[start][end]!=-1)
			return dp[start][end];
		int x = A[start]+Math.min(helper(A,start+2,end,dp),helper(A,start+1,end-1,dp));
		int y = A[end]+Math.min(helper(A,start+1,end-1,dp),helper(A,start,end-2,dp));
		dp[start][end]=Math.max(x,y);
		return dp[start][end];
	}
	public static int maxCoins(int A[],int n)
	{
		int dp[][]=new int[n][n];
		for(int row[]:dp)
			Arrays.fill(row,-1);
		return helper(A,0,n-1,dp);
    }
	public static void main(String[] args) 
	{
		int a[]= {8,15,3,7};
		System.out.println(maxCoins(a,a.length));
	}

}
