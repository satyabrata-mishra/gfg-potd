package cp;
import java.math.*;
public class Multiply_Two_Strings 
{
	public static String multiplyStrings(String s1,String s2)
    {
		BigInteger b1=new BigInteger(s1);
	    BigInteger b2=new BigInteger(s2);
	    BigInteger mul=b1.multiply(b2);
	    return mul.toString();
    }
	public static void main(String[] args) 
	{
		System.out.println(multiplyStrings("33","2"));
	}

}
