package cp;
public class Largest_Prime_Factor 
{
	public static boolean isPrime(int n)
	{
		for(int i=2;i*i<=n;i++)
			if(n%i==0)
				return false;
		return true;
	}
	public static long largestPrimeFactor(int N) 
	{
		if(isPrime(N))
            return N;
        int maxFactor = 1;
        for(int i=2; i*i<=N; i++)
        {
            if(N%(N/i)==0 && isPrime(N/i))
                maxFactor = Math.max(maxFactor, N/i);
            else if(N%i==0 && isPrime(i))
                maxFactor = Math.max(maxFactor, i);
        }
        return maxFactor;
    }
	public static void main(String[] args) 
	{
		System.out.println(largestPrimeFactor(5));
		System.out.println(largestPrimeFactor(24));
	}
}