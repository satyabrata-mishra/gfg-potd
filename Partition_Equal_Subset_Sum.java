package cp;
public class Partition_Equal_Subset_Sum 
{
	public static int equalPartition(int N, int arr[])
    {
		 int sum = 0;
		 for(int i = 0; i < N; i++)
			 sum += arr[i];
		 if(sum % 2!=0)
			 return 0;
		 sum /= 2;
		 int dp[]=new int[sum+1];
		 dp[0] = 1;
		 for(int i = 0; i < N; i++)
			 for(int j = sum; j >= arr[i]; j--)
				 dp[j] |= dp[j - arr[i]];
		 return dp[sum];
    }
	public static void main(String[] args) 
	{
		int arr[] = {1, 5, 11, 5};
		String ans = equalPartition(arr.length,arr)==1?"YES":"NO";
		System.out.println(ans);
	}
}