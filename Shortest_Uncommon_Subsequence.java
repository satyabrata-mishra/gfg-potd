package cp;
public class Shortest_Uncommon_Subsequence 
{
//	static final int MAX = 1005;
	static int shortestUnSub(String S, String T) 
    {
		int MAX = 1005;
		int m = S.length(), n = T.length();
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++)
            dp[i][0] = 1;
        for (int i = 0; i <= n; i++)
            dp[0][i] = MAX;
        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                char ch = S.charAt(i-1);
                int k;
                for (k = j - 1; k >= 0; k--)
                    if (T.charAt(k) == ch)
                        break;
                if (k == -1)
                    dp[i][j] = 1;
                else
                    dp[i][j] = Math.min(dp[i - 1][j],dp[i - 1][k] + 1);
            }
        }
        int ans = dp[m][n];
        if (ans >= MAX)
            ans = -1;
        return ans;
    }
	public static void main(String[] args) 
	{
		String s = "babhi";
		String t = "babij";
		System.out.println(shortestUnSub(s,t));
	}

}
