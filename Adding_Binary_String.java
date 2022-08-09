package cp;

import java.math.BigInteger;

public class Adding_Binary_String 
{
	public static String addBinary(String A, String B) 
    {
		java.math.BigInteger x = new java.math.BigInteger(A,2);
		java.math.BigInteger y = new java.math.BigInteger(B,2);
		return x.add(y).toString(2);
    }
	public static void main(String[] args) 
	{
		String a="1101", b="111"; 
		System.out.println(addBinary(a,b));
	}

}
