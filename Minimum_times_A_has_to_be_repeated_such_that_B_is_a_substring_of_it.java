package cp;

public class Minimum_times_A_has_to_be_repeated_such_that_B_is_a_substring_of_it 
{
	public static int minRepeats(String A, String B) 
    {
		String c="";
		int count=0;
		while(c.length()<=2*B.length())
		{
			if(c.contains(B))
				return count;
			c+=A;
			count++;
		}
		return -1;
    }
	public static void main(String[] args) 
	{
		System.out.println(minRepeats("abcd","cdabcdab"));
	}

}
