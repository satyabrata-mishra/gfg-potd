package cp;
import java.util.*;
public class Isomorphic_Strings 
{
	public static boolean helper(String str1,String str2)
	{
		HashMap<Character,Character> map = new HashMap<Character, Character>();
		for(int i=0;i<str1.length();i++)
		{
			char temp1=str1.charAt(i),temp2=str2.charAt(i);
			if(map.containsKey(temp1) && map.get(temp1)!=temp2)
				return false;
			else
				map.put(temp1, temp2);
		}
		return true;
	}
	public static boolean areIsomorphic(String str1,String str2)
    {
		if(str1.length()!=str2.length())
			return false;
		if(helper(str1,str2) && helper(str2,str1))
			return true;
		return false;
    }
	public static void main(String[] args) 
	{
		String a="pijthbsfy",b="fvladzpbf";
		System.out.println(areIsomorphic(a,b));
	}
}