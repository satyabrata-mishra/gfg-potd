//A no is divisible by 8 if its last 3 digits are divisible by 8.
package cp;
public class Check_if_a_number_is_divisible_by_8 
{
	public static int DivisibleByEight(String s)
    {
		if(s.length()<=3)
			return Integer.parseInt(s)%8==0?1:-1;
		return Integer.parseInt(s.substring(s.length()-3,s.length()))%8==0?1:-1;
    }
	public static void main(String[] args) 
	{
		String s="54141111648421214584416464555";
		System.out.println(DivisibleByEight(s));
		s="16";
		System.out.println(DivisibleByEight(s));
	}
}