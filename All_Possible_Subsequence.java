package cp;
import java.util.*;
public class All_Possible_Subsequence 
{
	public static void helper(String str,String ans,ArrayList<String> list)
	{
		if(str.length()==0)
		{
			if(ans.length()!=0)
				list.add(ans);
			return;
		}
		helper(str.substring(1),ans+str.charAt(0),list);
		helper(str.substring(1),ans,list);
	}
	public static ArrayList<String> allPossibleSubsequence(String str)
	{
		ArrayList<String> ans=new ArrayList<String>();
		helper(str,"",ans);
		Collections.sort(ans);
		return ans;
	}
	public static void main(String[] args) 
	{
		String str="abc";
		System.out.println(allPossibleSubsequence(str));
	}
}