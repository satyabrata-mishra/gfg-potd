package cp;

public class Minimum_characters_to_be_added_at_front_to_make_string_palindrome 
{
	public static int minChar(String str)
    {
		int i=0,j=str.length()-1,n=str.length()-1,ans=0;
		while(i<j)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				++i;--j;
			}
			else
			{
				ans++;
				i=0;
				j=--n;
			}
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(minChar("abc"));
	}

}
