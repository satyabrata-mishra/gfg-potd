package cp;
//Longest palindromic subsequence is nothing but the 
//Longest Common Subsequence(LCS) of S and reverse(S).
public class Longest_Palindromic_Subsequence 
{
	public int longestPalinSubseq(String S)
    {
		int n = S.length();
		String rev = new StringBuilder(S).reverse().toString();
		int dp[][]=new int[n+1][n+1];
//		Logic for Longest Common Subsequence(LCS)
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(S.charAt(i-1)==rev.charAt(j-1))
					dp[i][j]=1+dp[i-1][j-1];
				else
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			}
		}
		return dp[n][n];
    }
	public static void main(String[] args) 
	{
		Longest_Palindromic_Subsequence ob = new Longest_Palindromic_Subsequence();
		System.out.println(ob.longestPalinSubseq("bbabcbcab"));
	}
}