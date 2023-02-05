package cp;
import java.util.*;
public class Optimal_LIS 
{
	public static int optimal_LIS(int H[],int N)
	{
		int dp[] = new int[N+1];
        int ans = 0;
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = Integer.MIN_VALUE;
        for(int i=0; i<N; i++)
        {
            int key = H[i], low = 0, high = dp.length;
            while(low <= high)
            {
                int mid = (high + low) / 2;
                if(dp[mid] >= key && dp[mid-1] < key)
                {
                	dp[mid] = key;
                	break;
                }
                else if(dp[mid] < key)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        for(int i=N; i>=0; i--)
            if(dp[i] != Integer.MAX_VALUE)
            {
            	ans = i;
            	break;
            }
        return ans;
	}
	public static void main(String[] args) 
	{
		int H[] = {9, 1, 2, 3, 1, 5};
		System.out.println(optimal_LIS(H,H.length));
	}

}
