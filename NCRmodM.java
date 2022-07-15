package cp;

public class NCRmodM
{
	public static long fact(long n)
	{
		long temp=1;
		for (long i=1;i<=n;i++)
			temp*=i;
		return temp;
	}
	public static int nCr(long n, long r)
    {
        return (int)(fact(n)/(fact(r)*fact(n-r)))%1000003;
    }
	public static void main(String[] args)
	{
//		System.out.println(fact(4));
		System.out.println(nCr(20,10));
	}

}
