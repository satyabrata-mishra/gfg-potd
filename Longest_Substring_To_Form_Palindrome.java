package cp;
import java.util.*;
public class Longest_Substring_To_Form_Palindrome 
{
	public static ArrayList<String> stringlist = new ArrayList<String>();
	public static boolean isPalindrome(String str)
	{
		StringBuilder s=new StringBuilder(str);
		s=s.reverse();
		if(str.equalsIgnoreCase(new String(s)))
			return true;
		return false;
	}
	public static void permutation(String q,String a)
	{
		if(q.length()==0)
			stringlist.add(a);
		for(int i=0;i<q.length();i++)
			permutation(q.substring(0,i)+q.substring(i+1),a+q.charAt(i));
	}
	public static int longestSubstring(String S)
	{
		for(int i=0;i<S.length();i++)
			for(int j=i;j<S.length();j++)
				permutation(S.substring(i,j+1),"");
		int temp=Integer.MIN_VALUE;
		String tempstring="";
		for(String s:stringlist)
			if(isPalindrome(s) && s.length()>temp)
			{
				tempstring=s;
				temp=s.length();
			}
		System.out.println(tempstring);
		return temp;
    }
	public static void main(String[] args) 
	{
		System.out.println(longestSubstring("adbabd")); //aab
//		longestSubstring("aa");
	}

}