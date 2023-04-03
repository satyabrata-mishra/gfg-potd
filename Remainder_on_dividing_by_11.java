package cp;

import java.math.*;

public class Remainder_on_dividing_by_11 
{
//	Shortcut
	public static int xmod11_shortcut(String x)
	{    
        BigInteger b1 = new BigInteger(x,10);
        BigInteger ans = b1.mod(new BigInteger("11"));
        return ans.intValue();
	}
//	Real method
	public static int xmod11(String x)
	{    
		if(x.length()==1)
			return Integer.parseInt(x);
		int n = x.length();
		char arr[]=x.toCharArray();
		String quotient="";
		int rem = Integer.parseInt(""+arr[0]+arr[1])%11;
		quotient+= Integer.parseInt(""+arr[0]+arr[1])/11;
		for(int i=2;i<n;i++)
		{
			String temp = ""+rem+arr[i];
			rem = Integer.parseInt(temp)%11;
			quotient+= Integer.parseInt(temp)/11;
		}
		System.out.println("Quotient is "+quotient);
		return rem;
	}
	public static void main(String[] args) 
	{
		System.out.println("Remainder is "+xmod11("389636"));
	}

}
