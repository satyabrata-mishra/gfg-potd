package cp;
import java.util.*;
public class Roman_To_Integer 
{
	public static int roman_to_integer(String roman)
	{
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		int ans=map.get(roman.charAt(roman.length()-1));
		for(int i=roman.length()-1;i>=1;i--)
		{
			if(map.get(roman.charAt(i))>map.get(roman.charAt(i-1)))
				ans-=map.get(roman.charAt(i-1));
			else
				ans+=map.get(roman.charAt(i-1));
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the roman you want to convert to integer ");
		String str=sc.next();
		System.out.println(roman_to_integer(str));
		sc.close();
	}
}