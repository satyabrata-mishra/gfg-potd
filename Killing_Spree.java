package cp;

public class Killing_Spree 
{
	public static long killinSpree(long n)
    {
		long count=0,sum=0;
		if(n==1)
			return 1;
		for(long i=1;i<n;i++)
		{
			sum+=(i*i);
			if(sum<=n)
				++count;
			else
				break;			
		}
		return count;
    }
	public static void main(String[] args) 
	{
		System.out.println(killinSpree(10));
	}

}
