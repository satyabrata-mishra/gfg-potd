package cp;
public class Count_number_of_hops 
{
	static long countWays(int n)
    {
		if(n<=2)
			return n;
		long a=1,b=1,c=2;
		for(int i=3;i<=n;i++)
		{
			long temp=(a+b+c)%1000000007;
			a=b;
			b=c;
			c=temp;
		}
		return c%1000000007;
    }
	public static void main(String[] args) 
	{
		System.out.println(countWays(1));
		System.out.println(countWays(4));
		System.out.println(countWays(7));
	}
}