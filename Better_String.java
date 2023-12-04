package cp;
import java.util.*;
public class Better_String 
{
	static HashSet<String> noOfSubsequences(int i, String s, String f,HashSet<String> set) 
	{
		if (i==s.length()) 
		{
			set.add(f);
			return set;
		}
		noOfSubsequences(i+1,s,f+s.charAt(i),set);
		noOfSubsequences(i+1,s,f,set);
		return set;
	}
	public static String betterString(String str1, String str2) 
	{
	    int a=noOfSubsequences(0,str1,"",new HashSet<String>()).size();
	    int b=noOfSubsequences(0,str2,"",new HashSet<String>()).size();
		return a>=b?str1:str2;
	}
	public static void main(String[] args) 
	{
		String str1 = "ljmolmti", str2 = "sqapzwbb";
		System.out.println(betterString(str1, str2));
	}
}