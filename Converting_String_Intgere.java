package cp;

public class Converting_String_Intgere 
{
	public static int atoi(String str) 
	{
		int i=0,ans=0;
		boolean pos=true;
		if(str.charAt(i)=='-')
		{
			i++;
			pos=false;
		}
		for(;i<str.length();i++)
		{
			char temp = str.charAt(i);
			if(temp<'0' || temp>'9')
				return -1;
			else
				ans = ans*10+Character.valueOf(temp);
		}
		if(pos)
			return ans;
		return ans*-1;
	}
	public static void main(String[] args)
	{
		System.out.println("123");
		System.out.println("-456");
	}
}
