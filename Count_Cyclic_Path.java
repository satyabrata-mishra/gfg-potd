package cp;
public class Count_Cyclic_Path 
{
	public static int countPaths(int N)
	{
		long mod = 1000000007,o=1,a=0,b=0,c=0;
		for(int i=1;i<=N;i++)
		{
			long temp1=o,temp2=a,temp3=b,temp4=c;
			o=(temp2+temp3+temp4)%mod;
			a=(temp1+temp3+temp4)%mod;
			b=(temp1+temp2+temp4)%mod;
			c=(temp1+temp2+temp3)%mod;
		}
		return (int)(o%mod);
	}
	public static void main(String[] args) 
	{
		System.out.println(countPaths(2));
	}
}