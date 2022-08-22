package cp;

public class URL_Shortner 
{
	public static String idToShortURL(long n) 
    {
		String s= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuilder ans = new StringBuilder();
		while(n>0)
		{
			int rem = (int)(n%62);
			ans.append(s.charAt(rem));
			n/=62;
		}
		return ans.reverse().toString();
    }
	public static void main(String[] args) 
	{
		System.out.println(idToShortURL(30540));
	}

}
