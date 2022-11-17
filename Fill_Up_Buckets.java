package cp;

import java.util.Arrays;

public class Fill_Up_Buckets 
{
	public static int totalWays(int n, int[] capacity)
    {
        Arrays.sort(capacity);
        int ans = 1, mod = 1000000007;
        for(int i=0;i<n;i++)
        {
        	ans = (int)((ans*(long)(capacity[i]-i))%mod);
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		int capacity[]= {5,8};
		System.out.println(totalWays(capacity.length,capacity));
	}

}
