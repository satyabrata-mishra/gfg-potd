package cp;
public class Count_Palindromic_Subsequences 
{
	public static long countPS(String s)
    {
		final long MOD = 1000_000_007; 
        int len = s.length();
        long[][] dp = new long[len][len];
        for(int i = len - 1; i >= 0; --i)
        {
            dp[i][i] = 1;
            for(int j = i + 1; j < len; ++j)
            {
                 if(s.charAt(i) == s.charAt(j))
                    dp[i][j] = ((dp[i+1][j] + dp[i][j-1]) % MOD + 1) % MOD; 
                 else
                    dp[i][j] = (dp[i][j-1] + dp[i + 1][j]- dp[i + 1][j-1] + MOD) % MOD;
                
            }
        }
        return dp[0][len-1];
		
    }
	public static void main(String[] args) 
	{
		System.out.println(countPS("aab"));
	}

}
