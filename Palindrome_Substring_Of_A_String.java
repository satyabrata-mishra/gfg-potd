package trial;
import java.util.*;
public class Palindrome_Substring_Of_A_String
{
	public static boolean checkPalindrome(String str)
	{
		String temp=str;
		StringBuilder s=new StringBuilder(temp);
		s=s.reverse();
		temp=new String(s);
		if(temp.equalsIgnoreCase(str))
			return true;
		return false;
	}
	public static int palindromeSubStrs(String str)
    { 
		HashSet<String> s=new HashSet<String>();
        char ch[]=str.toCharArray();
        for (int i=0;i<ch.length;i++) 
        {
        	for (int j=i;j<ch.length;j++)
        	{
        		String temp="";
        		for (int k=i;k<=j;k++)
        			temp+=ch[k];
        		s.add(temp);
        	}
        }
        int temp=0;
        for (String i:s)
        	if(checkPalindrome(i))
        		++temp;
        return temp;
    }
	public static void main(String[] args)
	{
		System.out.print(palindromeSubStrs("abaaa"));
//		palindromeSubStrs("abaaa");
	}

}
