package cp;
public class Sheryansh_And_His_Bits
{
	public static long ncr(int n,int r)
	{
		long dp[][] = new long[n+1][r+1];
		for(int i=0;i<=n;i++)
			dp[i][0]=1;
		for(int i=1;i<=n;i++)
			for(int j=1;j<=r;j++)
				dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
		return dp[n][r];
	}
	public static long count(long n)
    {
		String s = Long.toBinaryString(n);
		int c=0,ind=0;
        long ans=0;
        for(int i=s.length()-1;i>=0;i--,++ind)
        	if(s.charAt(i)=='1')
        		ans+=ncr(ind,++c);
        return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(count(4));
		System.out.println(count(8));
	}
}
//Question----->
//Find out that how many positive integers, strictly less than N, 
//have the same number of set bits as N.
//Hint------>
//We need to count the number of integers less than N with same number of bits.
//For this, we first write the binary representation of N. We need integers less 
//than N, so for each set bit in the binary representation of N, we will 
//calculate that in how many ways the numbers of set bits on the 
//right of each set bit can be arranged.
//For example, 
//N = 10
//Binary representation = 1010
//For the 1st set bit
//1010
//
//We have 2 set bits on the right (including itself), which needs to be arranged in 3 places.
//So, answer += 3C2 or nCr(3,2)
//
//For the 2nd set bit
//1010
//
//We have 1 set bit on the right (including itself), which need to be arranged in 1 places.
//So, answer += 1C1 or nCr(1,1)