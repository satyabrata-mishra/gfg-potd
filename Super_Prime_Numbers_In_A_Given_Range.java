package cp;
import java.util.*;
public class Super_Prime_Numbers_In_A_Given_Range
{
	public static boolean isPrime(int n)
	{
		if(n==0 || n==1)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}
	public static void superPrimes(int n)
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i=2;i<=n;i++)
			if(isPrime(i))
				ar.add(i);
		for(int i=1;i<=ar.size();i++)
			if(isPrime(i))
				System.out.print(ar.get(i-1)+" ");
	}
	public static void main(String[] args)
	{
		superPrimes(241);
	}

}
