package cp;
import java.util.*;
public class Find_Anagram_In_A_Given_String 
{
	public static boolean isAnagram(String s1,String s2)
	{
		for(int i=0;i<s1.length();i++)
			if(!s2.contains(""+s1.charAt(i)))
				return false;
		return true;
	}
	public static ArrayList<String> findAnagrams(String head, String s) 
    {
		ArrayList<String> ans = new ArrayList<String>();
		int n = s.length();
		for(int i=0;n<=head.length();i++,n++)
		{
			String temp = head.substring(i,n);
			if(isAnagram(temp,s) && !ans.contains(temp))
				ans.add(temp);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(findAnagrams("abca","abc"));
	}
}