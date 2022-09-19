package cp;

public class Composite_And_Prime 
{
	public static boolean isPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}
	public static int Count(int L, int R)
    {
		int ccount=0,pcount=0;
		for(int i=L;i<=R;i++)
			if(i==1)
				continue;
			else if(isPrime(i))
				pcount++;
			else 
				ccount++;
		return (ccount-pcount);
    }
	public static void main(String[] args) 
	{
		System.out.println(Count(1,24));
	}

}
