package cp;
import java.util.*;
public class Cutting_Rectangles 
{
	public static long gcd(long a,long b)
	{
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	public static ArrayList<Long> minimumSquares(long L, long B)
    {
		ArrayList<Long> ans = new ArrayList<Long>();
		long gcd = gcd(L,B);
		long minSide=gcd;
		long noOfSquares=(L/gcd) * (B/gcd);
		ans.add(noOfSquares);
		ans.add(minSide);
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(minimumSquares(6,3));
	}

}
