package cp;
public class Smith_Number 
{
	public static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		for(int i=2;i*i<=n;i++)
			if(n%i==0)
				return false;
		return true;
	}
	public static int digitSum(int n)
	{
		int ans=0;
		while(n>0)
		{
			ans+=n%10;
			n/=10;
		}
		return ans;
	}
	public static int factorSum(int n)
	{
        int i=2, sum=0;  
        while(n>1) 
        {  
            if(n%i==0)
            {  
                sum+=digitSum(i);  
                n=n/i;  
            }  
            else
            {  
                do{  
                    i++;  
                }
                while(!isPrime(i));  
            }  
        }  
        return sum;
    }
	public static int smithNum(int n) 
    {
		if(isPrime(n))
			return 0;
		if(digitSum(n)==factorSum(n))
			return 1;
		return 0;
    }
	public static void main(String[] args) 
	{
		System.out.println(smithNum(4));
		System.out.println(smithNum(378));
	}
}