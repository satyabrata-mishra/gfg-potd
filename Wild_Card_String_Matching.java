package cp;

public class Wild_Card_String_Matching 
{
	public static boolean match(String wild, String pattern)
    {
		int n = pattern.length();
        int m = wild.length();
        boolean dp[][]=new boolean[n+1][m+1];
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=m; j++)
            {
                if(j == 0)
                {
                    if(i == 0)
                        dp[i][j] = true;
                    else if(pattern.charAt(i-1) == '*')
                        dp[i][j] = dp[i-1][j];
                    else
                        dp[i][j] = false;
                }
                else if(i == 0)
                    dp[i][j] = false;
                else
                {
                    if(pattern.charAt(i-1) == wild.charAt(j-1) || pattern.charAt(i-1) == '?')
                        dp[i][j] = dp[i-1][j-1];
                    else if(pattern.charAt(i-1) == '*')
                        dp[i][j] = dp[i][j-1] || dp[i-1][j-1] || dp[i-1][j];
                    else
                        dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
	public static void main(String[] args) 
	{
		String wild="baaabab";
		String pattern="ba*a?";
		System.out.println(match(wild,pattern));
	}

}
