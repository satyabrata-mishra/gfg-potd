package cp;
public class Super_Primes 
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
	public static int superPrimes(int n)
    {
        int count=0;
        for(int i=2;i<=n;i++)
	        if(isPrime(i-2) && isPrime(i))
	        	++count;
       return count;
    }
	public static void main(String[] args) 
	{
		System.out.println(superPrimes(10));
	}

}
