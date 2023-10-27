package cp;
//Intuition - To find minimum deletions required to make a string palindrome
//we just need to find Longest Palindromic Seqsequence.
public class Minimum_Deletions_To_Make_A_String_Palindrome 
{
	static int minimumNumberOfDeletions(String S)
    {
		String S_Rev=new StringBuilder(S).reverse().toString();
		int len=S.length();
		int dp[][]=new int[len+1][len+1];
		for(int i=1;i<=len;i++)
		{
			for(int j=1;j<=len;j++)
			{
				if(S.charAt(i-1)==S_Rev.charAt(j-1))
					dp[i][j]=1+dp[i-1][j-1];
				else
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		return len-dp[len][len];
    }
	public static void main(String[] args)
	{
		System.out.println(minimumNumberOfDeletions("aebcbda"));
		System.out.println(minimumNumberOfDeletions("geeksforgeeks"));
	}
}