package cp;
import java.util.*;
public class Wheather_we_can_form_a_palindrome_number_from_given_digits 
{
	public static boolean isPossible(int n)
	{
		String str = Integer.toString(n);
		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		for(int i=0;i<str.length();i++)
		{
			int temp=Character.getNumericValue(str.charAt(i));
			if(hs.containsKey(temp))
				hs.put(temp, hs.get(temp)+1);
			else
				hs.put(temp , 1);
		}
		System.out.println(hs);
		int oddcount=0;
		for(int i:hs.keySet())
			if(hs.get(i)%2!=0)
				++oddcount;
		if(oddcount>1)
			return false;
		return true;
	}
	public static void main(String[] args)
	{
		int n=1012;
		System.out.println(isPossible(n));
	}

}
