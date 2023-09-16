package cp;
public class Perfect_Sum_Problem 
{
	public static int perfectSum(int arr[],int n, int sum) 
	{ 
		int MOD = 1000000007;
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++)
        {
            for (int j = sum; j >= arr[i]; j--) 
            {
                dp[j] += dp[j - arr[i]];
                dp[j] %= MOD;
            }
        }
        return dp[sum];
	} 
	public static void main(String[] args) 
	{
		int arr[] = {2, 3, 5, 6, 8, 10};
		int sum = 10;
		System.out.println(perfectSum(arr, arr.length, sum));
	}
}