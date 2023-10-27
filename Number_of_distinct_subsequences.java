package cp;
import java.util.*;
public class Number_of_distinct_subsequences 
{
	public static int distinctSubsequences(String S) 
    {
		int[] last = new int[26];
        Arrays.fill(last, -1);
        int mod = 1000000007, n = S.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) 
        {
            dp[i] = 2 * dp[i - 1];
            dp[i] %= mod;
            if (last[S.charAt(i - 1)-'a'] != -1)
                dp[i] = (dp[i] - dp[last[S.charAt(i - 1)-'a']] + mod) % mod;
            last[S.charAt(i - 1)-'a'] = (i - 1);
        }
        return dp[n];
    }
	public static void main(String[] args) 
	{
		System.out.println(distinctSubsequences("gfg"));
		System.out.println(distinctSubsequences("ggg"));
	}
}