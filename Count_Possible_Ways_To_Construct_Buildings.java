package cp;
public class Count_possible_ways_to_construct_buildings 
{
	public static int TotalWays(int N)
    {
		long mod = 1000000007;
		long [] f = new long[N+1];
		f[0] = f[1] = 1;
		for(int i = 2; i <= N; i++)
			f[i]  = (f[i-1]%mod + f[i-2]%mod)%mod;
		return (int)(((f[N] + f[N-1])*(f[N] + f[N-1]))%mod);
    }
	public static void main(String[] args) 
	{
		System.out.println(TotalWays(1));
		System.out.println(TotalWays(3));
	}
}
