//Shortest Common Supersequence-Given two strings X and Y of 
//lengths m and n respectively, find the length of the 
//smallest string which has both, X and Y as its sub-sequences.
//Shortest Common Supersequence=|str1| + |str2| - LCS
package cp;
public class Shortest_Common_Supersequence 
{
	public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
		int dp[][]=new int[m+1][n+1];
		for(int i=1;i<=m;i++)
			for(int j=1;j<=n;j++)
				if(X.charAt(i-1)==Y.charAt(j-1))
					dp[i][j]=1+dp[i-1][j-1];
				else
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
		return m+n-dp[m][n];
    }
	public static void main(String[] args) 
	{
		String X="abccd",Y="xxyccd";
		System.out.println(shortestCommonSupersequence(X,Y,X.length(),Y.length()));
	}
}