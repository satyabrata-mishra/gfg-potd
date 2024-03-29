package cp;

public class Longest_Common_Subsequence 
{
	public static int lcs(int x, int y, String s1, String s2)
    {
        int dp[][]=new int[x+1][y+1];
        for(int i=1;i<=x;i++)
            for(int j=1;j<=y;j++)
                if(s1.charAt(i-1)==s2.charAt(j-1))
					dp[i][j]=1+dp[i-1][j-1];
				else
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        return dp[x][y];
    }
	public static void main(String[] args) 
	{
		String s1="ABCDGH",s2="AEDFHR";
		System.out.println(lcs(s1.length(),s2.length(),s1,s2));
	}

}
