package cp;

public class Validate_An_IP_Address 
{
	public static boolean isValid(String s) 
    {
		int dotcount=0;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)=='.')
				++dotcount;
		if(dotcount!=3)
			return false;
		String str[]=s.split("\\.");
		if(str.length!=4)
			return false;
		for(String i:str)
		{
			if(i=="")
				return false;
			int temp=Integer.parseInt(i);
			if(!Integer.toString(temp).equals(i))
				return false;
			if(temp<0 || temp>255)
				return false;
		}
		return true;
    }
	public static void main(String[] args) 
	{
		String s="256.256.256.256";
		System.out.println(isValid(s));
	}
}
