package cp;
public class Help_Ishaan 
{
	public static boolean isPrime(int n)
	{
		if(n < 2)
            return false;
		for(int i=2;i<=Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}
	public static int NthTerm(int N)
    {
		if(isPrime(N))
			return 0;
		int i=N+1,j=N-1;
		for(;;i++)
			if(isPrime(i))
				break;
		for(;j>=2;j--)
			if(isPrime(j))
				break;
		System.out.println(i+" "+j);
		if(Math.abs(N-i)<Math.abs(N-j))
			return Math.abs(N-i);
		else
			return Math.abs(N-j);
    }
	public static void main(String[] args) 
	{
		System.out.println(NthTerm(10));
	}

}
