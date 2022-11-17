//Given two strings S and W. Find the number of times W appears as a 
//subsequence of string S where every character of string S 
//can be included in forming at most one subsequence.
//S = "abcdrtbwerrcokokokd" 
// W = "bcd" 
//Output: 
// 2
package cp;
public class Find_Subsequence 
{
	public static int numberOfSubsequences(String S, String W)
    {
		int ans=0;
		boolean isVisited[]=new boolean[S.length()];
		for(int i=0;i<S.length();i++)
		{
			int k=0;
			for(int j=0;j<S.length();j++)
			{
				if(k<W.length() && S.charAt(j)==W.charAt(k) && !isVisited[j])
				{
					k++;
					isVisited[j]=true;
				}
			}
			if(k>=W.length())
				++ans;
		}
		return ans;
    }
	public static void main(String[] args)
	{
		System.out.println(numberOfSubsequences("abcdrtbwerrcokokokd","bcd"));
	}

}
