package cp;
import java.util.*;
public class Weight_Of_An_String 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String ");
		String s="goku";
		s=s.toLowerCase();
		HashMap<Character, Integer> a =new HashMap<Character, Integer>();
		char ch='a';
		for(int i=1;i<=26;i++,ch++)
			a.put(ch,i);
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isAlphabetic(c) && c!='a' && c!='e' && c!='i' && c!='o' && c!='u')
				sum+=a.get(c);
		}
		System.out.print(sum);
	}
}
