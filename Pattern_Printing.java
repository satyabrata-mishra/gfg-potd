//Pattern - 2 5 16 65...
package cp;
public class Pattern_Printing 
{
	public static int NthTerm(int n)
    {
		int mod=1000000007;
		long ans=1,temp=1;
		while(n>0)
		{
			ans=((ans*temp)%mod)+1%mod;
			System.out.print(ans+" ");
			++temp;
			--n;
		}
		System.out.println();
		return (int)ans%mod;
    }
	public static void main(String[] args) 
	{
		System.out.println(NthTerm(12));
	}

}
