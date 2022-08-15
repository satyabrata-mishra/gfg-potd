package cp;

public class Friends_Pairing_Problem 
{
	public static long countFriendsPairings(int n) 
    { 
		long a=1,b=1,c=1,mod=1000000007;
	       for(int i=2;i<=n;i++)
	       {
	           c=((b%mod)+(((i-1)%mod)*(a%mod))%mod)%mod;
	           a=b;
	           b=c;
	       }
	       return c;
    }
	public static void main(String[] args) 
	{
		System.out.println(countFriendsPairings(4));
	}

}
