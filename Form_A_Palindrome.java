package cp;
import java.util.*;
public class Form_A_Palindrome
{
	 public static boolean isPalindrome(String s)
	    {
	        StringBuilder sb=new StringBuilder(s);
	        sb=sb.reverse();
	        String str=new String(sb);
	        if(s.equalsIgnoreCase(str))
	            return true;
	        return false;
	    }
	 public static  int findMinInsertions(String S)
	    {
	        // code here
		 	String temp=S;
	        HashSet<Character> c=new HashSet<Character>();
	        for(int i=0;i<S.length();i++)
	            c.add(S.charAt(i));
	        c.remove(S.charAt(0));
	        int count=0;
	        for(Character i:c)
	        {
	        	if(isPalindrome(temp))
	        		break;
	        	temp=i+temp;
	        	++count;
	        }
	        System.out.println(temp);
	        return count;
	        
	    }
	public static void main(String[] args)
	{
		System.out.println(findMinInsertions("anasdad"));

	}

}
