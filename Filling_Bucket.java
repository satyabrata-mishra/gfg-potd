package cp;
public class Filling_Bucket 
{
	static int fillingBucket(int N) 
    {
		if(N==0)
			return 0;
		if(N==1)
			return 1;
		int dp[]=new int[N];
		dp[0]=1;
		dp[1]=2;
		for(int i=2;i<N;i++)
			dp[i]=(dp[i-2]+dp[i-1])%100000000;
		return dp[N-1];
    }
	public static void main(String[] args) 
	{
		System.out.println(fillingBucket(4));
	}

}
