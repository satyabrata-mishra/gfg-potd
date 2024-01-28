package cp;
public class Techfest_and_the_Queue 
{
	public static long primeFactors(long n)
	{
		int count=0;
        for(int i=2;i*i<=n;i++)
        {
            while(n%i==0)
            {
                count++;
                n/=i;
            }
        }
        if(n>1) 
        	count+=1;
        return count;
	}
	public static long sumOfPowers(long a, long b) 
    {
		long ans=0;
		for(long i=a;i<=b;i++)
			ans+=primeFactors(i);
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(sumOfPowers(9,12));
		System.out.println(sumOfPowers(24,27));
	}
}