package cp;
public class Grinding_Geek
{
	public static int helper(int cost[],int i,int total,Integer[][] dp)
	{
		if(i==cost.length)
			return 0;
		if(dp[i][total]!=null)
			return dp[i][total];
		if(total>=cost[i])
		{
			int price=total-cost[i]+(int)Math.floor(cost[i]*0.9);
			return dp[i][total]=Math.max(1+helper(cost,i+1,price,dp),helper(cost,i+1,total,dp));
		}
		return dp[i][total]=helper(cost,i+1,total,dp);
	}
	public static int max_courses(int n, int total, int[] cost) 
    {
		Integer[][] dp=new Integer[n][total+1];
		return helper(cost,0,total,dp);
    }
	public static void main(String[] args) 
	{
		int total = 10;
		int[] cost = {10, 9};
		System.out.println(max_courses(cost.length, total, cost));
	}
}