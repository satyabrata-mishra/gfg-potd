package cp;
import java.util.*;
public class Count_Palindromic_Subsequences 
{
	public static boolean isPalindrome(String s)
	{
		int low = 0,high = s.length()-1;
		while(low<high)
			if(s.charAt(low++)!=s.charAt(high--))
				return false;
		return true;
	}
	public static String removeLastCharacter(String s)
	{
		char ch[]=s.toCharArray();
		s="";
		for(int i=0;i<ch.length-1;i++)
			s+=ch[i];
		return s;
	}
	public static void subsequence(String s,int i,String cur,ArrayList<String> ans)
	{
		if(i==s.length())
		{
			ans.add(new String(cur));
			return;
		}
		cur+=s.charAt(i);
		subsequence(s,i+1,cur,ans);
		cur = removeLastCharacter(cur);
		subsequence(s,i+1,cur,ans);
	}
	public static long countPS(String str)
    {
		ArrayList<String> ans = new ArrayList<String>();
		subsequence(str,0,"",ans);
		Collections.sort(ans);
		ans.remove("");
		int count = 0;
		for(String i:ans)
			if(isPalindrome(i))
			{
				System.out.print(i+" ");
				++count;
			}
		return count;
    }
	public static void main(String[] args) 
	{
		System.out.println("\n"+countPS("abcd"));
	}

}
