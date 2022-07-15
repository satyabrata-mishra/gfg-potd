package cp;

public class Count_Possible_Ways_To_Construct_Buildings
{
	public static int TotalWays(int N)
    {
        // Code here
		long mod = 1000000007;
		long [] f = new long[N+1];
		f[0] = f[1] = 1;
		for(int i = 2; i <= N; i++)
			f[i]  = (f[i-1]%mod + f[i-2]%mod)%mod;
		long x = (f[N] + f[N-1])%mod;
		x = x * x;
		x %= mod;
		return (int)x;
    }
	public static void main(String[] args)
	{
		int N=10;
		System.out.println(TotalWays(N));
	}

}
