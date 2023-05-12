package cp;
import java.math.BigInteger;
public class Binary_Modulo 
{
//	Shortcut
	public static int modulo1(String s, int m) 
	{
		BigInteger b = new BigInteger(s,2);
		BigInteger ans = b.mod(BigInteger.valueOf(m));
		return ans.intValue(); 
	}
//	Using Horner's Rule
	public static int modulo(String s, int m) 
	{ 
		int k=0;
        for(char c:s.toCharArray())
        	k=(k*2 +(c-'0'))%m;
        return k;
	}
	public static void main(String[] args) 
	{
		System.out.println(modulo("101",2));
		System.out.println(modulo("1000",4));
	}
}