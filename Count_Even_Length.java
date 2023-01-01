package cp;
public class Count_Even_Length 
{
	public static int modInverse(int A, int M)
    {
        int m0 = M, y = 0, x = 1;
        if (M == 1)
            return 0;
        while (A > 1) 
        {
            int q = A / M;
            int t = M;
            M = A % M;
            A = t;
            t = y;
            y = x - q * y;
            x = t;
        }
        if (x < 0)
            x += m0;
        return x;
    }
	public static int  compute_value(int n)
    {
		int mod = 1000000007;
	    long ans=2;
	    long prev = 1;
	    for(int i=1;i<n;i++)
	    {
	        long temp = ((((n+1-i)*prev)%mod)*modInverse(i,mod))%mod;
	        prev = temp;
	        long t = (temp*temp)%mod;
	        ans = (ans+t)%mod;
	    }
	    return (int)ans%mod;
    }
	public static void main(String[] args) 
	{
		System.out.println(compute_value(2));
	}

}
