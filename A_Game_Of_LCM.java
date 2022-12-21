package cp;
public class A_Game_Of_LCM 
{
	public static long gcd(long a,long b)
	{
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	public static long helper(int n)
	{
		long ans=n;
		int include=1;
		for(long i=n-1;i>=1;i--)
		{
			long temp=gcd(ans,i);
			if(temp==1)
			{
				++include;
				ans*=i;
			}
			if(include==4)
				return ans;
		}
		return ans;
	}
	public static long maxGcd(int N) 
    {
		return Math.max(helper(N), helper(N-1));
    }
	public static void main(String[] args) 
	{
		System.out.println(maxGcd(4));
	}

}
