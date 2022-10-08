package cp;
public class Modified_Numbers_and_Queries 
{
	public static int sumOfAll(int l, int r)
    {
		int sum = 0;
		for(int i=l;i<=r;i++)
			if(i==1)
				sum+=i;
			else
				sum+=findPrimeFactors(i);
		return sum;
    }
	public static int  findPrimeFactors(int n)
	{
		int sum = 0;
        boolean prime[] = new boolean[n+1];
        for(int i=1; i<=n; i++)
            prime[i] = true;
        for(int i=2; i<=n; i++)
        {
            if(prime[i]&&n%i==0)
                sum+=i;
            for(int j=2*i; j<=n; j=j+i)
                prime[j] = false;
        }
        return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println(sumOfAll(1,6));
	}

}
