package cp;

public class Brain_Game
{
	public static boolean isPrime(int n)
	{
		if(n==0 || n==1)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}
	public static int Factors(int n)
	{
		int ans = 0;
        int num = n;
        for(int i=2; i<=num/2; i++)
        {
            while(n%i == 0)
            {
                ans++;
                n/= i;
            }
        }
        return ans;
	}
	public static boolean brainGame(int[] nums)
    {
		int ans=0;
        for(int num:nums)
            if(!isPrime(num))
                ans=ans^(Factors(num)-1);
        return ans!=0;
    }
	public static void main(String[] args) 
	{
		int nums[]= {2, 4, 7, 11};
		System.out.println(brainGame(nums));
	}

}
