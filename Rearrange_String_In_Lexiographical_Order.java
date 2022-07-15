package trial;

import java.util.*;

public class Rearrange_String_In_Lexiographical_Order
{
	public static String arrange(String str)
	{
		int sum=0;
		String str2="";
		for (int i=0;i<str.length();i++)
		{
			if (Character.isDigit(str.charAt(i)))
			{
				sum=sum+(Character.getNumericValue(str.charAt(i)));
			}
			if(Character.isAlphabetic(str.charAt(i)))
			{
				str2=str2+str.charAt(i);
			}
		}
		char ch[]=str2.toCharArray();
		Arrays.sort(ch);
		return (new String(ch)+sum);
	}

	public static void main(String[] args)
	{
		System.out.println(arrange("ACCBA10D2EW30"));
	}

}
