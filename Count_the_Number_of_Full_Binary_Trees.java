package cp;
public class Count_the_Number_of_Full_Binary_Trees 
{
	public static int numoffbt(int arr[], int n)
    {
		int min = Integer.MAX_VALUE, max = 1;
        for (int  i : arr) 
        {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        int[] dp = new int[max + 1];
        for (int i : arr) 
        	dp[i] = 1;
        int ans = 0;
        for (int i = min; i <= max; i++) 
        {
            if (dp[i] == 0) 
            	continue;
            for (int j = i + i; j <= max && j / i <= i; j += i) 
            {
                if (dp[j] == 0) 
                	continue;
                dp[j] += (dp[i] * dp[j / i]);
                if (i != j / i) 
                	dp[j] += (dp[i] * dp[j / i]);
            }
            ans = (ans + dp[i]) % 1000000007;
        }
        return ans % 1000000007;
    }
	public static void main(String[] args) 
	{
		int arr[] = {2, 3, 4, 6};
		System.out.println(numoffbt(arr,arr.length));
	}

}
