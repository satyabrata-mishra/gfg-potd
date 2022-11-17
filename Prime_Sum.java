package cp;

public class Prime_Sum 
{
	public static boolean isPrime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}
	public static String isSumOfTwo(int N)
    {
		for(int i=2;i<N;i++)
			if(isPrime(i)&&isPrime(N-i))
				return "Yes";
		return "No";
    }
	public static void main(String[] args)
	{
		System.out.println(isSumOfTwo(34));
	}

}
