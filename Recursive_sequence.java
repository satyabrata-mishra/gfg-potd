package cp;
public class Recursive_sequence 
{
	public static long sequence(int n)
    {
		long ans=0,counter=1;
		int mod=1000000007;
		for(int i=1;i<=n;i++)
		{
			long mult=1;
			for(int j=1;j<=i;j++,counter++)
				mult=(mult*counter)%mod;
			ans=(ans+mult)%mod;
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(sequence(5)); //365527
		System.out.println(sequence(7)); //6997165
		System.out.println(sequence(50));//533841206
	}
}