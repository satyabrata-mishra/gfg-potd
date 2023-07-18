package cp;
public class Power_of_a_Number 
{
	static int mod=1000000007;
	static long modfun(long n, long  R)
	{ 
	    if (n == 0) 
	        return 0; 
	    if (R == 0)  
	        return 1;  
	    long ans; 
	    if (R % 2 == 0) 
	    { 
	        ans = modfun(n, R/2);  
	        ans = (ans * ans) % mod; 
	    } 
	    else 
	    { 
	        ans = n % mod; 
	        ans = (ans * modfun(n, R - 1) % mod) % mod; 
	    } 
	    return ((ans+mod)%mod)%mod;  //  <----Catch
	}     
	static long power(int N,int R)
	{
	    return modfun(N,R);
	}
	public static void main(String[] args) 
	{
		int N=14,rev=0; //722400406
		int temp=N;
		while(temp!=0)
		{
			rev=(rev*10)+(temp%10);
			temp/=10;
		}
		System.out.println(power(N,rev));
	}
}